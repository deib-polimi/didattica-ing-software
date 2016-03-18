package scacchi;

import java.io.IOException;
import java.util.Scanner;

import scacchi.scacchiera.Casella;
import scacchi.scacchiera.Color;
import scacchi.scacchiera.Coordinata;
import scacchi.scacchiera.Scacchiera;
import scacchi.scacchiera.pezzi.Pezzo;

public class Gioco {

	private static final int N_PLAYERS = 2;
	private final Player[] players;
	private final Scacchiera scacchiera;

	public Gioco() {
		players = new Player[N_PLAYERS];
		players[0] = new Player(Color.WHITE);
		players[1] = new Player(Color.BLACK);
		scacchiera = new Scacchiera();
	}

	public void gioca() throws IOException {
		int i = 0;
		while (true) {
			System.out.println("Tocca a " + players[i % 2]);
			Player currPlayer = players[i % 2];
			boolean valid = false;
			Scanner in = new Scanner(System.in);
			do {
				System.out.println(this.scacchiera);
				System.out
						.println("Specifica la riga dove si trova la pedina che vuoi muovere");
				int riga = in.nextInt();
				System.out
						.println("Specifica la colonna dove si trova la pedina che vuoi muovere");
				int colonna = in.nextInt();

				Casella casellaSelezionata = scacchiera
						.getCasella(new Coordinata(riga, colonna));
				if (casellaSelezionata.getPezzo() != null
						&& casellaSelezionata.getPezzo().getColor()
								.equals(currPlayer.getColor())) {
					Pezzo pezzo = casellaSelezionata.getPezzo();

					System.out
							.println("Specifica la riga dove vuoi muovere il pezzo");
					int rigaDestinazione = in.nextInt();
					System.out
							.println("Specifica la colonna dove vuoi muovere il pezzo");
					int colonnaDestinazione = in.nextInt();
					Casella casellaDestinazione=this.scacchiera.getCasella(new Coordinata(rigaDestinazione, colonnaDestinazione));
					if(pezzo.mossaValida(this.scacchiera, casellaDestinazione)){
						casellaSelezionata.unsetPezzo();
						casellaDestinazione.setPezzo(pezzo);
						pezzo.setCasella(casellaDestinazione);
						valid=true;
						
					}
					else{
						System.out
						.println("Non e' possibile muovere la pedina nella colonna specificata");
				
					}

				} else {
					System.out.println("Nella casella [" + riga + "]["
							+ colonna
							+ "] non e' contenuta una pedina del tuo colore");
				}

			}while(!valid);
        	i++;
		}
	}
}