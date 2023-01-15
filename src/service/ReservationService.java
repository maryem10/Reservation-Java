package service;

import DAO.IDAO;
import connection.Connexion;
import entites.Chambre;
import entites.Client;
import entites.Reservation;

import java.sql.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

public class ReservationService implements IDAO<Reservation> {

    List<Reservation> reservations;
             ChamberService Chs = new ChamberService();
        ClientService Cs = new ClientService();
        public CategorieService cs = new CategorieService();
    public ReservationService() {
        reservations = new ArrayList<Reservation>();
    }
//public Clie cs = new CategorieService();
    @Override

    public boolean create(Reservation o) {
        String req = "insert into reservation values(null,?,?,?,?)";
        try {
            PreparedStatement pr = new Connexion().getCon().prepareStatement(req);
            pr.setDate(1, new Date(o.getDateDebut().getTime()));
            pr.setDate(2, new Date(o.getDateFin().getTime()));
            pr.setInt(3, o.getChambre().getId());
            pr.setInt(4, o.getClient().getId());
            if (pr.executeUpdate() == 1) {
                System.out.println("reservation a ete cree");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean update(Reservation o) {
        String req = "update reservation set dateDebut=?,dateFin=?,id_chambre=?,id_client=? where id=?";
               try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setDate(1, new Date(o.getDateDebut().getTime()));
            pr.setDate(2, new Date(o.getDateFin().getTime()));
            pr.setInt(3, o.getChambre().getId());
            pr.setInt(4, o.getClient().getId());

            pr.setInt(5, o.getId());
            
            if (pr.executeUpdate() == 1) {
                System.out.println(pr.executeUpdate());
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;

    }

    
        public boolean verifierRes(Chambre chambre, java.util.Date dateDebut, java.util.Date dateFin){
            Connection con = Connexion.getCon();
            String req = "SELECT * from reservation WHERE id_chambre = ? and ((? between dateDebut and dateFin) or (? between dateDebut and dateFin) or (? < dateDebut and ? > dateFin))";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1, chambre.getId());
                ps.setDate(2, new Date(dateDebut.getTime()));
                ps.setDate(3, new Date(dateFin.getTime()));
                ps.setDate(4, new Date(dateDebut.getTime()));
                ps.setDate(5, new Date(dateFin.getTime()));
                ResultSet res = ps.executeQuery();
                if(res.next()){
                    return false;
                }
                //return true;
            } catch (SQLException e){
                System.out.println(e);
            }
            return true;
        }
    //@Override//simple date formt
    /*public boolean update(Reservation o) {
     for (Reservation r:reservations
     ) {
     if(r.getId()==o.getId()){
     Scanner red = new Scanner(System.in);
     System.out.println("entre le num de chambre");
     r.setChambre(red.nextInt());
     System.out.println("entre le num de client");
     r.setClientId(red.nextInt());

     r.setDateDebut(o.getDateDebut());
     r.setDateFin(o.getDateFin());
     }

     }
     return false;
     }*/
    @Override
    public boolean delete(Reservation o) {
        try {
			String req = "delete from reservation where id = ?";
			PreparedStatement pr =Connexion.getCon().prepareStatement(req);
			pr.setInt(1, o.getId());
			if (pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
        
         
    }

    @Override
    public Reservation findById(int id) {
   
        String req = "select * from reservation where id=?";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new Reservation(rs.getDate(1),rs.getDate(2),Chs.findById(rs.getInt(4)),Cs.findById(rs.getInt(3)));
            }
        } catch (SQLException e) {
            new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        ClientService Cs = new ClientService();
        ChamberService Chs = new ChamberService();
        String req = "select * from reservation";
        List<Reservation> reservation = new ArrayList<Reservation>();

        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                Reservation r = new Reservation();
                r.setId(rs.getInt(1));
                r.setDateDebut(rs.getDate(2));
                r.setDateFin(rs.getDate(3));
                r.setChambre(Chs.findById(rs.getInt(4)));
                r.setClient(Cs.findById(rs.getInt(5)));
                reservation.add(r);

            }
            return reservation;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return reservations;
    }

    public List<Chambre> findChambreBetweenDates(Client cl, java.util.Date dateDeb, java.util.Date dateFin) {
        
       
        List<Chambre> ch = new ArrayList<Chambre>();
       //SELECT ch.* FROM reservation R inner join chambre ch on R.id_chambre=ch.id WHERE R.id_client =1 And R.dateDebut BETWEEN "2022-9-02" and "2022-12-01";

        String res = "SELECT distinct ch.* FROM reservation R inner join chambre ch on R.id_chambre=ch.id WHERE R.id_client =? And R.dateDebut between ? and ?";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(res);
            pr.setDate(2, new Date(dateDeb.getTime()));
            pr.setDate(3, new Date(dateFin.getTime()));
            pr.setInt(1,cl.getId());
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                /*this.id = ++cmp;
        this.telephone = telephone;
        this.categorie = cat;*/
                ch.add(new Chambre(rs.getInt(1), rs.getString(2), cs.findById(rs.getInt(3))));
               

            }
            
        } catch (SQLException ex) {
            new RuntimeException(ex);
        }
        
       
         return ch;
    }

    

  

}
