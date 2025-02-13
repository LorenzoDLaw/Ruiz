/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversioneauto;

/**
 *
 * @author alunni
 */
public class ConversioneAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lunghezzaAutoMillimetri = 254;
        int metri = lunghezzaAutoMillimetri / 1000 ;
        int millimetriRimasti = lunghezzaAutoMillimetri % 1000;
        int centimetri = millimetriRimasti / 10 ;
        int millimetri = millimetriRimasti % 10;
        System.out.println ("La lunghezza dell'auto è di " + metri + "metri,"  + centimetri +" centimetri e " + millimetri + " millimetri.");
        
    }
    
}
