package gestBiblioteca;

public class Libro {
    int idCounter;
    private String titolo;
    private String autore;
    private String genere;
    private String codice;
    private boolean inPrestito;

    public Libro(String titolo, String autore, String genere, boolean inPrestito, int idCounter) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.inPrestito = inPrestito;
        this.idCounter = idCounter;
        codice = generaCodice();
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

    public boolean inPrestito() {
        return inPrestito;
    }

    public void setInPrestito(boolean inPrestito) {
        this.inPrestito = inPrestito;
    }
    
    public String generaCodice(){
        String tit = titolo.substring(0, 3).toLowerCase();
        String autor = autore.substring(0, 3).toLowerCase();
        String gen = genere.substring(0, 2).toLowerCase();
        return codice = tit  + autor + gen + "" + idCounter;
    }

	@Override
	public String toString() {
		return "Libro: titolo " + titolo + ", autore " + autore + ", genere " + genere + ", codice " + codice
				+ ", inPrestito " + inPrestito + "]";
	}
    
    
}
