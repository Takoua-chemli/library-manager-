/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbibliothèque;

/**
 *
 * @author PC
 */
public class Gestionbibliothèque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document document = new Document(5, "Document generique");
        System.out.println(document.toString());
        
        Livre livre = new Livre(3, "National Geographic", "Polio", 1280);
        System.out.println(livre.toString());
        
        Revenu revue = new Revenu(3, "National Geographic", 2, 2024);
        System.out.println(revue.toString());
        
        Dictionnaire dictionnaire = new Dictionnaire(4, "Dictionnaire Francais", "Francais");
        System.out.println(dictionnaire.toString());
        
        Roman roman = new Roman(1, "Mon petit roman", "Tolkien", 1178, 9);
        System.out.println(roman.toString());
        
        Manuel manuel = new Manuel(2, "Mathématiques 5ème", "John", 256, 5);
        System.out.println(manuel.toString());
            
        Bibliothéque biblio1 = new Bibliothéque(50);
        biblio1.ajouter(document);
        biblio1.ajouter(livre);
        biblio1.ajouter(revue);
        biblio1.ajouter(dictionnaire);
        biblio1.ajouter(roman); 
        biblio1.ajouter(manuel);
        biblio1.afficherDocuments();
        biblio1.afficherAuteurs();
        
    }
}
