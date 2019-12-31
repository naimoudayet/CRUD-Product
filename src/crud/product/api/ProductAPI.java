/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.product.api;

import crud.product.dao.ProductDao;
import crud.product.models.Produit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naim_
 */
public class ProductAPI implements ProductDao {

    Statement s;
    Connection c;
    String query;

    @Override
    public void add(Produit produit) {
        try {
            c = dbConnection();
            s = c.createStatement();

            query
                    = "INSERT INTO produit(designation, description, qte) "
                    + "VALUES ('"
                    + produit.getDesignation()
                    + "', '"
                    + produit.getDescription()
                    + "', '"
                    + produit.getQte()
                    + "')";

            s.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Produit produit) {

        try {
            c = dbConnection();
            s = c.createStatement();

            query = "DELETE FROM produit WHERE id= '"
                    + produit.getId() + "'";

            s.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Produit produit) {

        try {
            c = dbConnection();
            s = c.createStatement();

            query
                    = "UPDATE produit "
                    + "SET designation='" + produit.getDesignation() + "'"
                    + " ,description='" + produit.getDescription() + "' "
                    + ",qte='" + produit.getQte() + "' "
                    + "WHERE id = '" + produit.getId() + "'";

            s.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Produit> showAll() {
        List<Produit> result = new ArrayList<>();

        try {
            c = dbConnection();
            s = c.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM produit");

            while (rs.next()) {

                Produit p = new Produit(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );

                result.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public Produit showById(int id) {
        Produit produit = null;

        try {
            c = dbConnection();
            s = c.createStatement();

            ResultSet rs = s.
              executeQuery("SELECT * FROM produit WHERE id= '"+id+"'");

            if (rs.next()) {

                produit = new Produit(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produit;
    }

    public Connection dbConnection() {
        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/crud_product";
            String username = "root";
            String password = "";

            con = DriverManager.
                    getConnection(url, username, password);

            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
