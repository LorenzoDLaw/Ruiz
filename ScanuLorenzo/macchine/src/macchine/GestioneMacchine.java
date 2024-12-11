/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macchine;

import java.util.Scanner;

/**
 *
 * @author alunni
 */
public class GestioneMacchine {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Servizio noleggio auto:");
        System.out.println("Nome:");
        String nome = input.next();
        System.out.println("Targa:");
        String targa = input.next();
        System.out.println("Modello:");
        String modello = input.next();
        System.out.println("Giorni del noleggio:");
        int giorni = input.nextInt();
        
        
    }
    
}
