/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.foi.uzdiz.abstractfactory;

/**
 *
 * @author Winner
 */
public abstract class VFS {
    
    
    public abstract void ispisiStablo(int redniBroj);
    public abstract void ispisiNadredjene(int redniBroj);
    public abstract void obrisiElement(int redniBroj);
    public abstract void kopirajElement(int redniBroj, int odrediste);
    public abstract void prebaciElement(int redniBroj, int odrediste);
    
    
}
