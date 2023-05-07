/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sietedenoviembre;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author suare
 */
public class SieteDeNoviembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties p= new Properties();
        p.load(new FileReader("conf.propeties.txt"));
        System.out.println(p.getProperty("titulo"));
        System.out.println(p.getProperty("nombre"));
        System.out.println(p.getProperty("apellido"));        
    }
    
}
