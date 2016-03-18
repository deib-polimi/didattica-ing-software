package scacchi.scacchiera;
// casella estende coordinata

import scacchi.scacchiera.pezzi.Pezzo;

public class Casella {

	private Pezzo pezzo;
	private final Coordinata coordinata;

	public Casella(Coordinata coordinata) {
		// chiama il costruttore di coordinata
		setPezzo(null);
		this.coordinata = coordinata;
	}

	public Pezzo getPezzo() {
		return pezzo;
	}

	public void setPezzo(Pezzo pezzo) {
		this.pezzo = pezzo;
	}

	public boolean isEmpty() {
		if (this.pezzo == null) {
			return true;
		}
		return false;
	}

	public Pezzo unsetPezzo() {
		Pezzo pieceToBeReturned = this.pezzo;
		this.pezzo = null;
		return pieceToBeReturned;
	}

	@Override
	public String toString() {
		if (this.getPezzo() != null) {
			return this.getPezzo().toString();
		} else {
			return "         ";
		}

	}

	public Coordinata getCoordinata() {
		return coordinata;
	}

}
