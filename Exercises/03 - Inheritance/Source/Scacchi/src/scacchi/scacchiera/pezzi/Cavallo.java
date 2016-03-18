package scacchi.scacchiera.pezzi;

import scacchi.scacchiera.Casella;
import scacchi.scacchiera.Color;
import scacchi.scacchiera.Scacchiera;

public class Cavallo extends Pezzo {

	public Cavallo(Casella casella, Color color) {
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
			if((Math.abs(deltaX)==2&&Math.abs(deltaY)==1)||(Math.abs(deltaY)==2&&Math.abs(deltaX)==1)){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "C ["+this.getColor()+"]";
	}
}
