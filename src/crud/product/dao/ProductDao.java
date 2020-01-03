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

    // method pour ajouter un produit
    void add(Produit produit);

    // method pour supprimer un produit
    void delete(Produit produit);

    // method pour modifier un produit
    void update(Produit produit);

    // method pour afficher tous les produits
    List<Produit> showAll();
    
    // method pour affiche un seul produit
    Produit showById(int id);

}
