/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macchine;
/**
 *
 * @author alunni
 */
public class Macchina {
    String nome;
    String targa;
    String modello;
    int giorni;
    
    public void Macchina(String nome, String targa, String modello, int giorni ){
        this.nome = nome;
        this.targa = targa;
        this.modello = modello;
        this.giorni = giorni;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setTarga(String targa){
        targa = targa;
    }
    public String getTarga(){
        return targa;
    }
    
    public void setModello(String modello){
        modello = modello;
    }
    public String getModello(){
        return modello;
    }
    
    public void setTarga(int giorni){
        giorni = giorni;
    }
    public int getGiorni(){
        return giorni;
    }
    
}
// strutture fifo(first in first out) degli stack 
// struttura lifo (last in first out) 