/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author alunni
 */
public class BevandeAlcoliche extends Bevande{
    private int gradoAlcolico;
    public BevandeAlcoliche(String nome, double prezzo, int id, int quantitaInCl,int gradoAlcolico) {
        super(nome, prezzo, id, quantitaInCl);
        this.gradoAlcolico = gradoAlcolico;
    }
    
}
