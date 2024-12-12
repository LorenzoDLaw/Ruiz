/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author alunni
 */
public class Bevande extends Prodotto{
    protected int quantitaInCl;
    
    public Bevande(String nome, double prezzo,int quantitaInCl) {
        super(nome, prezzo);
        this.quantitaInCl = quantitaInCl;
    }

    public void setQuantitaInCl(int quantitaInCl) {
        this.quantitaInCl = quantitaInCl;
    }

    @Override
    public String toString() {
        return "Bevande{ nome:" + nome + "cl" + quantitaInCl + "prezzo: "+ prezzo +"}";
    }
    
}
