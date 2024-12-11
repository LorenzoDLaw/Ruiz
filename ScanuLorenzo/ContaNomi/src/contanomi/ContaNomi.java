/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contanomi;

import java.util.Scanner;

/**
 *
 * @author alunni
 */
public class ContaNomi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti nomi devo analizzare");
        int numNomi = input.nextInt();
        String []nomi = new String [numNomi];
        for(int i = 0; i < numNomi; i++){
            System.out.println("Inserisci il nome");
            String nome = input.next();
            nomi[i] = nome;
        }
        System.out.println("I nomi che inziano per vocale sono");
                
    }
    
}
