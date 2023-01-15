package service;

import DAO.IDAO;
import connection.Connexion;
import entites.Categorie;
import entites.Chambre;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategorieService implements IDAO<Categorie> {

    List<Categorie> categories;

    public CategorieService() {
        categories = new ArrayList<Categorie>();
    }

    @Override
    public boolean create(Categorie o) {
        String req = "insert into categorie values(null,?,?)";
        try {
            PreparedStatement pr = Connexion.getCon().prepareStatement(req);
            pr.setString(1, o.getCode());
            pr.setString(2, o.getLibelle());
            if (pr.executeUpdate() == 1) {
                System.out.println("votre categorie à été crée");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categories.add(o);
    }

    @Override
    public boolean update(Categorie o) {
        return false;
    }

    @Override
    public boolean delete(Categorie o) {
        try {
			String req = "delete from categorie where id = ?";
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
    public Categorie findById(int id) {
        String req = "select * from categorie where id=?";
        try {
            PreparedStatement ps = Connexion.getCon().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Categorie(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "CategorieService{"
                + "categories=" + categories
                + '}';
    }

    @Override
    public List<Categorie> findAll() {
        List<Categorie> listCat = new ArrayList<>();
        String req = "select * from categorie";

        try {

            PreparedStatement pr = new Connexion().getCon().prepareStatement(req);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                Categorie cat = new Categorie(rs.getInt(1), rs.getString(2), rs.getString(3));
                listCat.add(cat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listCat;
    }
}
