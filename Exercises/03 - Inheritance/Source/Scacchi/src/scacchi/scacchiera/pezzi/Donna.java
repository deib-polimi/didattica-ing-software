package scacchi.scacchiera.pezzi;

import scacchi.scacchiera.Casella;
import scacchi.scacchiera.Color;
import scacchi.scacchiera.Coordinata;
import scacchi.scacchiera.Scacchiera;

public class Donna extends Pezzo {

	public Donna(Casella casella, Color color) {
		super(casella, color);
	}

	@Override
	public boolean mossaValida(Scacchiera scacchiera, Casella destinazione) {
		if (destinazione != null) {
			// se la casella destinazione non \`e vuota e \`e presente un Pezzo
			// dello stesso
			// colore ritorna falso
			if (!destinazione.isEmpty()
					&& destinazione.getPezzo().getColor() == this.getColor()) {
				return false;
			}
			// calcola la distanza della cella rispetto all'asse delle x e delle
			// y
			int deltaX = destinazione.getCoordinata().getX() - this.getCasella().getCoordinata().getX();
			int deltaY = destinazione.getCoordinata().getY() - this.getCasella().getCoordinata().getY();
			// se il valore assoluto delle distanze \`e diverso ritorna false
			if (Math.abs(deltaX) == Math.abs(deltaY)) {
				// controlla tutte le caselle sulla diagonale, se in una di
				// queste c'e' un pezzo ritorna false
				for (int i = 1; i < Math.abs(deltaX); i++) {
					if (!scacchiera.getCasella(
							new Coordinata(this.getCasella().getCoordinata().getX()
									+ Integer.signum(deltaX) * i, this
									.getCasella().getCoordinata().getY()
									+ Integer.signum(deltaY) * i)).isEmpty()) {
						return false;
					}
				}
				return true;
			}
			int x = this.getCasella().getCoordinata().getX();
			int y = this.getCasella().getCoordinata().getY();
			if ((deltaX == 0) || (deltaY == 0)) {

				if (deltaY == 0) {
					// controlla tutte le caselle sulla diagonale, se in una di
					// queste c'e' un pezzo ritorna false
					for (int i = 1; i < Math.abs(deltaX); i++) {
						
						if (!scacchiera.getCasella(
								new Coordinata(x + i, y)).isEmpty()) {
							return false;
						}
					}
				}
				if (deltaX == 0) {
					for (int i = 1; i < Math.abs(deltaX); i++) {
						if (!scacchiera.getCasella(
								new Coordinata(x, y + i)).isEmpty()) {
							return false;
						}
					}
				}
				return true;
			}

			// ritorna true
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "D ["+this.getColor()+"]";
	}
}
