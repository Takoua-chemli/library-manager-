/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Roman  extends Livre{
    
    int pixLittéraire;
    
    public Roman() {
        super();
    }
    
    public Roman(int nbrEnregistrment, String titre, String auteur, int nbrPage, int pixLittéraire){
        super(nbrEnregistrment, titre, auteur, nbrPage);
        this.pixLittéraire = pixLittéraire;
    }
    
    public String toString(){
        return  "Roman ["+super.toString()+" pixLittéraire: "+this.pixLittéraire+ " ]";
    }
    
}
