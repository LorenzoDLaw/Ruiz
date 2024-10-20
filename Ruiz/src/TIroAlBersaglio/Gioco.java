package TIroAlBersaglio;

import java.util.Scanner;

public class Gioco {
	static int partecipanti;
	static String nomeGiocatore;
	static int numTiri;
	
	public static void main(String[] args) {
		Scanner inputConsole = new Scanner(System.in);
		System.out.println("inserisci il numero dei partecipanti: ");
		partecipanti = inputConsole.nextInt();
		Giocatore[] vGiocatori = new Giocatore[partecipanti];
		
		for (int i = 0; i < vGiocatori.length; i++) {	
			System.out.println("inserisci il nome del partecipante: ");
			nomeGiocatore = inputConsole.next();
			System.out.println("inserisci il numero di centri: ");
			numTiri = inputConsole.nextInt();
			Giocatore newGiocatore = new Giocatore(nomeGiocatore, numTiri);
			
			vGiocatori[i] = newGiocatore;
		}
		int index = 0;
		for (int i = 0; i < vGiocatori.length; i++) {	
			int tiro = vGiocatori[i].getNTiri();
			if (tiro>vGiocatori[index].getNTiri()) {
				index = i;
			}
		}
		System.out.println("il miglior giocatore è: "+ vGiocatori[index].getNome());
	}
}
