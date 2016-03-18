/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agence_voiture;

/**
 *
 * @author 20130377
 */
public class Adresse {
    
    protected int numero;
    protected String rue;
    protected String cp;
    protected String ville;
    
    public Adresse(int numero, String rue, String cp, String ville){
        this.numero = numero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }
            
    
}
