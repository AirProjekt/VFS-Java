/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.foi.uzdiz.composite;

import hr.foi.uzdiz.glavni.Glavna;

/**
 *
 * @author Winner
 */
public class Datoteka implements AbstractFile{
    
    private int broj;
    private String m_name;
    
    public Datoteka(String m_name, int broj){
        this.m_name = m_name;
        this.broj = broj;
    }

    @Override
    public void ls() {
        System.out.println( Glavna.g_indent +String.valueOf(broj)+" "+ m_name );

    }
    
    public int getBroj(){
        return broj;
    }
    
}
