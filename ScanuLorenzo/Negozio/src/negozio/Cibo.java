/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author alunni
 */

//nome prezzo id quantita  -->dole o salato 
public class Cibo extends Prodotto{
    double quantita;

    public Cibo(double quantita) {
        this.quantita = quantita;
    }

    
    public Cibo(String nome, double prezzo, double quantita) {
        super(nome, prezzo);
        this.quantita = quantita;
    }
    
    public double getQuantita() {
        return quantita;
    }

    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }
    
    
    
}
