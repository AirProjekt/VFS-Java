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
public class UnixFSFactory extends VFSFactory{

    @Override
    public VFS createVFS(Direktorij root) {
        return new EXT4VFS(root);
    }
    
}
