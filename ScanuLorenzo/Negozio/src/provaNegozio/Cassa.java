/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaNegozio;

import java.util.ArrayList;
import java.util.Scanner;
import negozio.BevandeAlcoliche;
import negozio.BevandeAnalcoliche;
/**
 *
 * @author alunni
 */
public class Cassa {
    ArrayList<Object> menu = new ArrayList<Object>();
    public static void main(String[] args) {
        System.out.println("Benvenuto nella cassa");
        while(true){
            System.out.println("Scegli l'operazione");
            System.out.println("1)Aggiungi prodotto \n 2)Stampa scontrino \n 3)Vedi menu");
             Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            switch (x) {
                case 1:
                    
                    //aggiungi prodotto
                    break;
                case 2:
                    //stampa scontrino
                    break;
                case 3: 
                    //vedi menu
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    
    
    private int aggiungiProdotto(){
        Scanner input = new Scanner(System.in);
        System.out.println("1)Bevande \n 2)Cibi");
        int x = input.nextInt();
        switch (x) {
            case 1:
                System.out.println("1)bevanda alcolica \n 2)bevanda analcolica");
                if (input.nextInt() == 1){
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    System.out.println("Prezzo:");
                    double prezzo = input.nextDouble();
                    System.out.println("Cl della bottiglia:");
                    int cl = input.nextInt();
                    System.out.println("Gradi della Birra");
                    int grado = input.nextInt();
                    BevandeAlcoliche alcolica = new BevandeAlcoliche(nome, prezzo, cl,grado);
                    menu.add(alcolica);
                    
                }else{
                    if (input.nextInt() == 1){
                       System.out.println("Nome:");
                        String nome = input.nextLine();
                        System.out.println("Prezzo:");
                        double prezzo = input.nextDouble();
                        System.out.println("Cl della bottiglia:");
                        int cl = input.nextInt();
                        System.out.println("Quantita zuccheri su cl");
                        int zuccheri = input.nextInt();
                        BevandeAnalcoliche alcolica = new BevandeAnalcoliche(nome, prezzo, cl,zuccheri);
                        menu.add(alcolica); 
                    }
                }
                break;
            case 2: 
                break;
            default:
                throw new AssertionError();
        }
        return x;
    }
    
    
    
    
}
