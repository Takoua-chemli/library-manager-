/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Livre extends Document{
    
    String auteur;
    int nbrPage;
    
    public Livre() {
        super();
    }
    
    public Livre(int nbrEnregistrment, String titre, String auteur, int nbrPage) {
        super(nbrEnregistrment, titre);
        this.auteur = auteur;
        this.nbrPage = nbrPage;
    
    }
    
    public String toString(){
        return  "Livre [ nbrEnregistrment"+this.nbrEnregistrment+" titre"+this.titre+" auteur: "+this.auteur+", nbrPage: "+ this.nbrPage + " ]";
    }
    
}
