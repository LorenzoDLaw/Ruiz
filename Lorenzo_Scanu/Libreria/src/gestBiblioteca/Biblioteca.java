package gestBiblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static ArrayList<Libro> biblioteca = new ArrayList<>();
    public static int idCounter = 1;
    
    public static void main(String[] args) {
        boolean continua = true;
    	Scanner scanner = new Scanner(System.in);
    	// TODO code application logic here
        while(continua){
            System.out.println("gestione libreria:"
                + "\n 1) Aggiungi libro"
                + "\n 2) Modifica disponibilità libro"
                + "\n 3) Stampa libri disponibili"
                + "\n 4) Stampa libri non disponibili"
                + "\n 5) Stampa tutti i libri"
                + "\n 6) Esci");
            try {
                int c = scanner.nextInt();
                switch (c) {
                    case 1:
                           System.out.println("Aggiungere libro");
                           Libro lib = aggiungiLibro();
                           biblioteca.add(lib);
                        break;
                    case 2:
                        System.out.println("Modifica disponibilità");
                        modificaDisponibilita();
                        break;
                    case 3:
                        System.out.println("Stampa libri disponibili");
                        stampaLibriDisponibili();
                        break;
                    case 4:
                        System.out.println("Stampa libri non disponibili");
                        stampaLibriNonDisponibili();
                        break;
                    case 5:
                        System.out.println("Stampa tutti i libri");
                        stampaTuttiLibri();
                        break;
                    case 6:
                        System.out.println("Grazie per aver usato il codice");
                        continua = false;
                        break;
                    default:
                    	System.out.println("Si prega di inserire un numero");
                }
            } catch (Exception e) {
            	System.out.println("Si prega di inserire un numero");
            	scanner.nextLine(); //pulisco la linea per evitare di leggere cose sbagliate
            }
        }      
        
             
    } // fine main
    
    
    public static Libro aggiungiLibro(){ //Inserisco i dati e poi vado a creare un nuovo libro e lo aggiungo alla lista
        Scanner scanner = new Scanner(System.in);
        System.out.println("Titolo del libro: ");
        String titolo = scanner.nextLine();
        System.out.println("Autore del libro: ");
        String autore = scanner.nextLine();
        System.out.println("Genere del libro: ");
        String genere = scanner.next(); 
        
        boolean validInput = false;
        boolean disponibile = true;;
        
        while (!validInput) {
            System.out.println("Libro in prestito (true/false): ");
            if (scanner.hasNextBoolean()) {  
                disponibile = scanner.nextBoolean();
                validInput = true;  // Se da un booleano esco dal ciclo
            } else {
                System.out.println("Input non valido. Inserire 'true' o 'false'.");
                scanner.nextLine();  // Pulisco la linea
            }
        } 
            
        Libro libro = new Libro(titolo, autore, genere, disponibile, idCounter);
        idCounter++;
        return libro;
    }
    
    public static void modificaDisponibilita() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo del libro da modificare: ");
        String titolo = scanner.nextLine();
        
        boolean libroTrovato = false;
        for (Libro libro : biblioteca) {
            if (libro.getTitolo().equalsIgnoreCase(titolo)) {
                libroTrovato = true;
                System.out.println("Il libro è " + (libro.inPrestito() ? "disponibile per il prestito" : "già in prestito"));
                System.out.println("Vuoi cambiarne lo stato? (true/false): ");
                boolean modifica = scanner.nextBoolean();
                scanner.nextLine();  // Consuma la nuova linea

                if (modifica) {
                    System.out.println("Inserire nuovo stato del prestito (true/false):");
                    boolean nuovoStato = scanner.nextBoolean();
                    libro.setInPrestito(nuovoStato);
                    System.out.println("Disponibilità aggiornata!");
                } else {
                    System.out.println("Stato del prestito non modificato");
                }
                break;  // Esci dal ciclo dopo aver trovato e modificato il libro
            }
        }

        if (!libroTrovato) {
            System.out.println("Libro non trovato.");
        }
    }


    public static void stampaLibriDisponibili() {
        System.out.println("Libri disponibili:");
        for (Libro libro : biblioteca) {
            if (libro.inPrestito()) {
                System.out.println(libro.toString());
            }
        }
    }

    public static void stampaLibriNonDisponibili() {
        System.out.println("Libri non disponibili:");
        for (Libro libro : biblioteca) {
            if (!libro.inPrestito()) {
                System.out.println(libro.toString());
            }
        }
    }

    public static void stampaTuttiLibri() {
        System.out.println("Lista di tutti i libri:");
        for (Libro libro : biblioteca) {
            System.out.println(libro.toString());
        }
    }
}

