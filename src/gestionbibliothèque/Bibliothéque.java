/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliothèque;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Bibliothéque {
    
    public ArrayList<Document> documents = new ArrayList<Document>();
    
    public int capacite;

    public Bibliothéque(int capacite) {
        this.capacite = capacite;
    }

    public void afficherDocuments() {
        System.out.println("Liste des ovrages de la bibliothèque :");
        for (int i = 0; i < documents.size(); i++) {
            Document doc1 = documents.get(i);
            System.out.println(doc1.toString()); 
        }
    }

    public Document document(int i) {
            return documents.get(i);
    }

    public boolean ajouter(Document doc) {
        if (documents.size() < capacite) {
            documents.add(doc);
            return true;
        } else {
            return false;
        }
    }

    public boolean supprimer(Document doc) {
        if (!documents.isEmpty()){ 
            return documents.remove(doc);
        }else{
           
            return false;
        }
    }
    
    public void afficherAuteurs() {
    System.out.println("Liste des auteurs de la bibliothèque :");
    for (int i = 0; i < documents.size(); i++) {
        Document doc1 = documents.get(i);
        if (documents.get(i) instanceof Livre){
        System.out.println(((Livre) doc1).auteur); 
        }
    }
    }


    

}

