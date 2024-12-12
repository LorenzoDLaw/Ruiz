/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author alunni
 */
public class CiboSalato extends Cibo{
    
    public CiboSalato(String nome, double prezzo,  double quantita) {
        super(nome, prezzo, quantita);
    }

    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }
    
   
    
}
