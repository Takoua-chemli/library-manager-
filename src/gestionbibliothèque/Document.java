/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Document {
    int nbrEnregistrment;
    String titre;
    
    public Document() {
        
    }
    
    public Document(int nbrEnregistrment, String titre) {
        this.nbrEnregistrment = nbrEnregistrment;
        this.titre = titre;
    }
    
    public String toString(){
        return  "Document [nbrEnregistrment: "+this.nbrEnregistrment+", titre: "+ this.titre + " ]";
    }
    
    
}
