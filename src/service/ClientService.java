package service;

import DAO.IDAO;
import connection.Connexion;
import entites.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientService implements IDAO<Client> {

    @Override
    public boolean create(Client o) {
        String req = "insert into client values(null,?,?,?)";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setString(1, o.getNom());
            pr.setString(2, o.getTelephone());
            pr.setString(3, o.getEmail());
            if (pr.executeUpdate() == 1) {
                System.out.println("votre client a été cree");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean update(Client o) {
        String rq = "update client set nom=?,telephone=?,email=? where id=?";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(rq);

            pr.setString(1, o.getNom());

            pr.setString(2, o.getTelephone());
            pr.setString(3, o.getEmail());
            pr.setInt(4, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public boolean delete(Client o) {
        String rq = "delete  from client where id=?";

        try (PreparedStatement pr = Connexion.getCon().prepareStatement(rq)) {
            pr.setInt(1, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }
            return false;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Client findById(int id) {
        String req = "select * from client where id= ?";
        try {
            PreparedStatement ps = Connexion.getCon().prepareStatement(req);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            //rs contien ligne
            if (rs.next()) {
                return new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Client> findAll() {
        List<Client> listClient = new ArrayList<>();
        String req = "select * from client ";

        try {
            PreparedStatement ps = Connexion.getCon().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Client C = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listClient.add(C);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listClient;
    }
}
