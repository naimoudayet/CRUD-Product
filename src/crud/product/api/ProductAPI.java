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
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author naim_
 */
public class ProductAPI implements ProductDao {

    @Override
    public void add(Produit produit) {

    }

    @Override
    public void delete(Produit produit) {
    }

    @Override
    public void update(Produit produit) {
    }

    @Override
    public List<Produit> showAll() {
        return null;
    }

    @Override
    public Produit showById(int id) {
        return null;
    }

    public Connection dbConnection() {
        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/crud_product";
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
