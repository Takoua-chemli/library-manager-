/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Manuel extends Livre{
    int niveauScolaire;
    
    public Manuel() {
        super();
    }
    
    public Manuel(int nbrEnregistrment, String titre, String auteur, int nbrPage, int niveauScolaire){
        super(nbrEnregistrment, titre, auteur, nbrPage);
        this.niveauScolaire = niveauScolaire;
    }
    
    public String toString(){
        return  "Roman ["+super.toString()+" niveauScolaire: "+this.niveauScolaire+ " ]";
    }
}
