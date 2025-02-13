/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alunni
 */
public class Biblioteca {
    ArrayList<Libro> biblioteca = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            System.out.println("gestione libreria:"
                + "\n 1) Aggiungi libro"
                + "\n 2) Modifica disponibilità libro"
                + "\n 3) Stampa libri disponibili"
                + "\n 4) Stampa libri non disponibili");
            Scanner scanner = new Scanner(System.in);
            try {
                int c = scanner.nextInt();
                switch (c) {
                    case 1:
                           System.out.println("Aggiungere libro");
                           
                        break;
                    case 2:
                        System.out.println("Modifica disponibilità");
                        break;
                    case 3:
                        System.out.println("Stampa libri disponibili");
                        break;
                    case 4:
                        System.out.println("Stampa libri non disponibili");
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        }      
        
            
        
    } // fine main
    
    
    public void aggiungiLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Titolo del libro: ");
        String titolo = scanner.nextLine();
        System.out.println("Autore del libro: ");
        String autore = scanner.nextLine();
        System.out.println("Genere del libro: ");
        String genere = scanner.next();
        System.out.println("Libro in prestito (true/false): ");
        boolean disponibile = scanner.nextBoolean();
    }
}
