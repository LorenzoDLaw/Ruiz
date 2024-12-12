/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author alunni
 */
public class BevandeAnalcoliche extends Bevande{
    private int zuccheri;
    public BevandeAnalcoliche(String nome, double prezzo, int quantitaInCl, int zuccheri) {
        super(nome, prezzo,quantitaInCl);
        this.zuccheri = zuccheri;
    }

    @Override
    public String toString() {
        return "bevanda " + nome + " costa: " + prezzo + " " + quantitaInCl + "cl";
    }
    
}