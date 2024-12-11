/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author alunni
 */
// attributi nome id prezzo
//metodi get e set 
public class Prodotto {
    protected String nome;
    protected double prezzo;
    private int id; // una volta inserite non va più modificato 

    public Prodotto(String nome, double prezzo, int id) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.id = id;
    }

    public Prodotto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "nome=" + nome + ", prezzo=" + prezzo + ", id=" + id + '}';
    }

    
    
}


