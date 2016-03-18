/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agence_voiture;

/**
 *
 * @author 20130377
 */
public class Exemplaire {
    
    protected int numero;
    protected int km;
    Vehicule vehicule;
    
    public Exemplaire(int numero, int km, Vehicule vehicule)
    {
        this.numero=numero;
        this.km=km;
        this.vehicule=vehicule;
    }
    
}
