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
public abstract class VFSFactory {
    
    private static VFSFactory singleton;
    
    public static VFSFactory getFactory(){
        String dsTip = System.getenv("DS_TIP");
        if (singleton == null) {
            if(dsTip.equals("FAT")){
                return new WinFSFactory();
            }
            else{
                return new UnixFSFactory();
            }
        }
        return singleton;
    }
    
    public abstract VFS createVFS(Direktorij root);
    
}
