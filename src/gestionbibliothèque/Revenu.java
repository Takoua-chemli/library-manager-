/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Revenu extends Document{
    
    int mois;
    int annee;
    
    public Revenu() {
        super();
    }
    
    public Revenu(int nbrEnregistrment, String titre, int mois, int annee) {
        super(nbrEnregistrment, titre);
        this.mois = mois;
        this.annee = annee;
    
    }
    
    public String toString(){
        return  "Revue [ nbrEnregistrment" +this.nbrEnregistrment+" titre"+this.titre+" mois+"+this.mois+" annee: "+ this.annee + " ]";
    }
    
}
