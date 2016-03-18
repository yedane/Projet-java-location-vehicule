/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agence_voiture;

/**
 *
 * @author 20130382
 */
public class Auto extends Vehicule{
    
    protected String modele;
    
    public Auto(String modele, String marque)
    {
        super(marque);
        this.modele=modele;
    }
    
}
