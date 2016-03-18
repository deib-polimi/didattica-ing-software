package scacchi.scacchiera.pezzi;

import scacchi.scacchiera.Casella;
import scacchi.scacchiera.Color;
import scacchi.scacchiera.Scacchiera;

public class Re extends Pezzo {

	public Re(Casella casella, Color color) {
		super(casella, color);
	}

	@Override
	public boolean mossaValida(Scacchiera scacchiera, Casella casellaFinale) {
		// se la casella finale non \`e nulla
		if (casellaFinale != null) {
			// se la casella non \`e vuota e \`e presente un Pezzo dello stesso
			// colore
			if (!casellaFinale.isEmpty()
					&& casellaFinale.getPezzo().getColor() == this.getColor()) {
				return false;
			}
			// ritorna true se la distanza tra la cella final e iniziale \`e di
			// una cella in orizzontale e in verticale
			return Math.abs(this.getCasella().getCoordinata().getX() - casellaFinale.getCoordinata().getX()) <= 1
					&& Math.abs(this.getCasella().getCoordinata().getY() - casellaFinale.getCoordinata().getY()) <= 1;

		}
		return false;
	}

	@Override
	public String toString() {
		return "R ["+this.getColor()+"]";
	}
}