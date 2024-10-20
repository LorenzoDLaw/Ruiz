package TIroAlBersaglio;

public class Giocatore {
	String nome;
	int tiri;
	
	
	public Giocatore(String nome, int tiri) {
		this.nome = nome;
		this.tiri = tiri;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNTiri() {
		return tiri;
	}
}
