/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.foi.uzdiz.abstractfactory;

import hr.foi.uzdiz.composite.Direktorij;

/**
 *
 * @author Winner
 */
public class EXT4VFS extends VFS{
    
    private Direktorij root;
    
    public EXT4VFS(Direktorij root){
        this.root = root;
    }

    @Override
    public void ispisiStablo(int redniBroj) {
        
    }

    @Override
    public void ispisiNadredjene(int redniBroj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obrisiElement(int redniBroj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kopirajElement(int redniBroj, int odrediste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prebaciElement(int redniBroj, int odrediste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
