/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agence_voiture;

import java.util.Objects;

/**
 *
 * @author 20130377
 */
public class Emprunteur {
    
    private int id;
    private String nom;
    private String prenom;
   private Adresse adresse;
    
   public Emprunteur(int id, String nom, String prenom, Adresse adresse)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse = adresse;
    }
   
   private void louer()
   {
       
   }
  
    private void ramener()
    {
        
    }
    
    
}
