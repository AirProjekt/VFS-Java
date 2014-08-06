/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.foi.uzdiz.glavni;

import hr.foi.uzdiz.abstractfactory.VFS;
import hr.foi.uzdiz.abstractfactory.VFSFactory;
import hr.foi.uzdiz.composite.Datoteka;
import hr.foi.uzdiz.composite.Direktorij;
import java.io.Console;
import java.io.File;

/**
 *
 * @author Winner
 */
public class Glavna {
    
    private static int counter;
    public static StringBuffer g_indent = new StringBuffer();

    
    public void walk( String path, Direktorij dir) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                counter++;
                Direktorij novi = new Direktorij(f.getName(),counter);
                dir.add(novi);
                walk( f.getAbsolutePath(), novi);
            }
            else {
                counter++;
                dir.add(new Datoteka(f.getName(), counter));
            }
        }
    }

    public static void main(String[] args) {
        counter = 0;
        Direktorij dirRoot = new Direktorij("Test",counter);
        Glavna fw = new Glavna();
        fw.walk("c:\\Test", dirRoot);
        dirRoot.ls();
        VFSFactory factory = VFSFactory.getFactory();
        VFS vfs = factory.createVFS(dirRoot);
        System.out.println("Popis komandi:");
        System.out.println("ls - ispisuje sadržaj od određenog elementa(npr. ls 1)");
        System.out.println("copy - kopira element s jednog mjesta na drugo preko rednih brojeva(npr. copy 2 4)");
        System.out.println("move - premješta element s jednog mjesta na drugo preko rednih brojeva(npr. move 2 4)");
        System.out.println("del - briše element preko rednog broja(npr. del 2)");
        System.out.println("lsup - ispisuje sadržaj od određenog elementa prema korjenskom(npr. lsup 1)");
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        String input = c.readLine();
        String split[] = input.split(" ");
        switch(split[0]){
            case "ls":
                vfs.ispisiStablo(Integer.valueOf(split[1]));
                break;
            case "copy":
                vfs.kopirajElement(Integer.valueOf(split[1]),Integer.valueOf(split[2]));
                break;
            case "move":
                vfs.prebaciElement(Integer.valueOf(split[1]),Integer.valueOf(split[2]));
                break;
            case "del":
                vfs.obrisiElement(Integer.valueOf(split[1]));
                break;
            case "lsup":
                vfs.ispisiNadredjene(Integer.valueOf(split[1]));
                break;
            default:
                System.out.println("Kriva komanda!");
        }
    }
}
