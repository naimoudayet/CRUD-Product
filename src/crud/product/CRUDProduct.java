/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.product;

import crud.product.api.ProductAPI;
import java.sql.Connection;

/**
 *
 * @author naim_
 */
public class CRUDProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection con
                = new ProductAPI().dbConnection();

        if (con == null) {
            System.out.println("error");
        } else {
            System.out.println("success");
        }
    }

}
