/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author alunni
 */
public class Libro {
    /**
     * @param args the command line arguments
     */
    private String nome;
    private int numPagine;
    
    
    public Libro(String nome, int numPagine){
        this.nome = nome;
        this.numPagine = numPagine;
    }

    public String getNome() {
        return nome;
    }
    public int getNumPagine() {
        return numPagine;
    }
}
