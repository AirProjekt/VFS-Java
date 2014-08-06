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
public class WinFSFactory extends VFSFactory{

    @Override
    public VFS createVFS(Direktorij root) {
        return new FAT32VFS(root);
    }
    
}
