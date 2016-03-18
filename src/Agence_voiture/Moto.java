/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agence_voiture;

/**
 *
 * @author 20130382
 */
public class Moto extends Vehicule
{
    protected int cylindree;
       
    public Moto(int cylindree,String marque)
    {
        super(marque);
        this.cylindree=cylindree;
    }
    
    
}
