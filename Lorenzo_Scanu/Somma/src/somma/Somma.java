/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somma;

import java.util.Scanner;

/**
 *
 * @author alunni
 */
public class Somma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------------");
        System.out.println("Qui qi sommare tutto quello che vui \n non è vero, solo int double e string \n segline uno");
        System.out.println("1) somma di int \n"
                + "2) somma di double \n"
                + "3) somma di stringhe");
        Scanner scanner = new Scanner(System.in);
        int i  = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Inserisci primo numero intero :");
                int x = scanner.nextInt();
                System.out.println("Inserisci secondo numero intero:");
                int y = scanner.nextInt();
                System.out.println(somma(x,y));
                break;
            case 2:
                System.out.println("Inserisci primo numero double:");
                double x1 = scanner.nextDouble();
                System.out.println("Inserisci secondo numero double:");
                double y1 = scanner.nextDouble();
                System.out.println(somma(x1,y1));
                
                break;
            case 3:
                System.out.println("Inserisci la prima stringa:");
                String x2 = scanner.next();
                System.out.println("Inserisci la seconda stringa:");
                String y2 = scanner.next();
                System.out.println(somma(x2,y2));
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static int somma(int x, int y){
        int somma = x + y;
        return somma;
    }
    
    public static double somma(double x, double y){
        double somma = x + y;
        return somma;
    }
    
    public static String somma(String x, String y){
        String somma = x + y;
        return somma;
    }
}
