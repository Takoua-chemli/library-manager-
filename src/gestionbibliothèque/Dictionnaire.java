/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Dictionnaire extends Document{
    
    String langue;
    
    public Dictionnaire() {
        super();
    }
    
    public Dictionnaire(int nbrEnregistrment, String titre, String langue) {
        super(nbrEnregistrment, titre);
        this.langue = langue;
    }
    
    public String toString(){
        return  "Dictionnaire [ nbrEnregistrment"+this.nbrEnregistrment+" titre"+this.titre+" langue"+this.langue+" ]";
    }
    
}
