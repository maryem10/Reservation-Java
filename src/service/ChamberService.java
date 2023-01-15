package service;

import DAO.IDAO;
import connection.Connexion;
import entites.Categorie;
import entites.Chambre;
import service.CategorieService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChamberService implements IDAO<Chambre> {

    public ChamberService() {
        chambres = new ArrayList<Chambre>();
    }
    public CategorieService cs = new CategorieService();
    List<Chambre> chambres;

    @Override
    public boolean create(Chambre o) {
        String req = "insert into chambre values(null,?,?)";

        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setString(1, o.getTelephone());
            pr.setInt(2, o.getCategorie().getId());

            if (pr.executeUpdate() == 1) {
                System.out.println("votre categorie a été crée");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public boolean update(Chambre o) {
        String req = "update chambre set telephone=?, id_Catégorie=? where id=?";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setString(1, o.getTelephone());
            pr.setInt(2, o.getCategorie().getId());
            pr.setInt(3, o.getId());
            if (pr.executeUpdate() == 1) {
                System.out.println(pr.executeUpdate());
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public boolean delete(Chambre o) {
        String req = "delete from chambre where id=?";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setInt(1, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public Chambre findById(int id) {
        String req = "select * from chambre where id=?";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new Chambre(rs.getInt(1), rs.getString(2), cs.findById(rs.getInt(3)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<Chambre> findAll() {
        CategorieService cs = new CategorieService();
        String req = "select * from chambre ";
        List<Chambre> chambre = new ArrayList<Chambre>();

        try {
            PreparedStatement ps = Connexion.getCon().prepareStatement(req);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Chambre l = new Chambre();
                l.setId(rs.getInt(1));
                l.setTelephone(rs.getString(2));
                l.setCategorie(cs.findById(rs.getInt(3)));

                chambre.add(l);

                System.out.println("\n ");
            }

            return chambre;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ChamberService{"
                + "chambres=" + chambres
                + '}';
    }

    public List<Chambre> findByCategorie(Categorie cat) {

        String res = "select * from chambre where id_Catégorie=?";
        List<Chambre> list = new ArrayList<Chambre>();

        PreparedStatement pr;
        try {
            pr = Connexion.getCon().prepareStatement(res);

            pr.setInt(1, cat.getId());
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                Chambre ch = new Chambre();
                ch.setId(rs.getInt(1));
                ch.setTelephone(rs.getString(2));
                ch.setCategorie(cs.findById(rs.getInt(3)));
                list.add(ch);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ChamberService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Chambre findByCategorie1(Categorie c) {
        for (Chambre ch : chambres) {
            if (ch.getCategorie().equals(c)) {

                return ch;
            }
        }
        return null;
    }
}
