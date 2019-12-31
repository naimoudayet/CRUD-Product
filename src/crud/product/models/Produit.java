/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.product.models;

/**
 *
 * @author naim_
 */
public class Produit {

    private int id;
    private String designation;
    private String description;
    private int qte;

    public Produit(int id, String designation, String description, int qte) {
        this.id = id;
        this.designation = designation;
        this.description = description;
        this.qte = qte;
    }

    public Produit(String designation, String description, int qte) {
        this.designation = designation;
        this.description = description;
        this.qte = qte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", designation=" + designation + ", description=" + description + ", qte=" + qte + '}';
    }
}
