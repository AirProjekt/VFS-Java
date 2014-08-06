/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.foi.uzdiz.composite;

import hr.foi.uzdiz.glavni.Glavna;
import java.util.ArrayList;

/**
 *
 * @author Winner
 */
public class Direktorij implements AbstractFile{
    
    private int broj;
    private String m_name;
    private ArrayList m_files = new ArrayList();
    
    public Direktorij(String m_name, int broj){
        this.m_name = m_name;
        this.broj = broj;
    }
    
    public void add(Object obj){
        m_files.add(obj);
    }

    @Override
    public void ls() {
        System.out.println( Glavna.g_indent + String.valueOf(broj) + " "+m_name );
        Glavna.g_indent.append( "   " );
        for (int i=0; i < m_files.size(); ++i) {
            // ***** Leverage the "lowest common denominator"
            AbstractFile obj = (AbstractFile) m_files.get(i);
            obj.ls();
        }
        Glavna.g_indent.setLength(Glavna.g_indent.length() - 3 );
    }
    
    public ArrayList getM_files(){
        return m_files;
    }
    
    public int getBroj(){
        return broj;
    }
}
