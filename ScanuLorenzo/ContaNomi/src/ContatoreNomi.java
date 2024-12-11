/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunni
 */
public class ContatoreNomi {
        // Metodo per contare e visualizzare i nomi che iniziano con una vocale
    public static void contaEVediNomiConVocale(String[] nomi) {
    int contatore = 0;
    for (String nome : nomi) {
        char primaLettera = Character.toLowerCase(nome.charAt(0));
        if (primaLettera== 'a'||primaLettera=='e'||primaLettera=='i'||primaLettera=='o'||primaLettera=='u'){
            System.out.println();
            contatore++;
            
        }
    }
    System.out.println("Numero totale di nomi che iniziano con una vocale: " + contatore);
    }
}
