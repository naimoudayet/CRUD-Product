/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.product.dao;

import crud.product.models.Produit;
import java.util.List;

/**
 *
 * @author naim_
 */

// DAO: data access object
public interface ProductDao {

    void add(Produit produit);

    void delete(Produit produit);

    void update(Produit produit);

    List<Produit> showAll();

    Produit showById(int id);

}
