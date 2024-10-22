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
    static double n1;
    static double n2;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'operatore tra +, -, /, *:");
        char operatore = scanner.next().charAt(0);
        System.out.println("Inserisci il primo numero:");
        n1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo numero");
        n2 = scanner.nextDouble();
        Operation operazione = new Operation(n1, n2);
        switch (operatore) {
            case '+':
                System.out.println( operazione.addizione());
                break;
            case '-':
                System.out.println( operazione.sottrazione());
                break;
            case '/':
                System.out.println( operazione.divisione());
                break;
            case '*':
                System.out.println( operazione.prodotto());
        }
    }
    
}
