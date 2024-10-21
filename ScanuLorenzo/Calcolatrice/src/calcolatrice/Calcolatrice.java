/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcolatrice;

import java.util.Scanner;

/**
 *
 * @author alunni
 */
public class Calcolatrice {
    int n1;
    int n2;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'operatore tra +, -, /, *:");
        char operatore = scanner.next().charAt(0);
        System.out.println("Inserisci il primo numero:");
        System.out.println("Inserisci il secondo numero");
        
        switch (operatore) {
            case '+':
                
                break;
            case '-':
                
                break;
            case '/':
                break;
            case '*':
        }
    }
    
}
