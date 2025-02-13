/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;
/*
titolo 
autore
preso in prestito 
genere
*/

/*
/**
 *
 * @author alunni
 */
public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private String codice;
    private boolean inPrestito;

    public Libro(String titolo, String autore, String genere, boolean inPrestito) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.inPrestito = inPrestito;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isInPrestito() {
        return inPrestito;
    }

    public void setInPrestito(boolean inPrestito) {
        this.inPrestito = inPrestito;
    }
    
    public void generaCodice(int pos){
        char tit = titolo.charAt(0);
        char autor = autore.charAt(0);
        char gen = genere.charAt(0);
        codice = tit + "" + autor + gen + "" + pos;
    }
}
