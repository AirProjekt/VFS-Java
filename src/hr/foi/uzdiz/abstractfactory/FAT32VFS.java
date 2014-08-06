/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.foi.uzdiz.abstractfactory;

import hr.foi.uzdiz.composite.AbstractFile;
import hr.foi.uzdiz.composite.Direktorij;

/**
 *
 * @author Winner
 */
public class FAT32VFS extends VFS{
    
    private Direktorij root;
    
    public FAT32VFS(Direktorij root){
        this.root = root;
    }

    @Override
    public void ispisiStablo(int redniBroj) {
        if(redniBroj == 0){
            root.ls();
        }
        else{
            for (int i=0; i < root.getM_files().size(); ++i) {
                AbstractFile obj = (AbstractFile) root.getM_files().get(i);
                if (obj.getBroj() == redniBroj) {
                    obj.ls();
                    break;
                }                             
            }
        }

    }

    @Override
    public void ispisiNadredjene(int redniBroj) {
        
    }

    @Override
    public void obrisiElement(int redniBroj) {
        
    }

    @Override
    public void kopirajElement(int redniBroj, int odrediste) {
        
    }

    @Override
    public void prebaciElement(int redniBroj, int odrediste) {
        
    }
    
}
