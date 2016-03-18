package scacchi.scacchiera.pezzi;

import scacchi.scacchiera.Casella;
import scacchi.scacchiera.Color;
import scacchi.scacchiera.Scacchiera;

public abstract class Pezzo {
	
	private final Color color;
	private Casella casella;
	
	public Pezzo(Casella casella, Color color){
		this.setCasella(casella);
		this.color=color;
	}
	
	public Color getColor() {
		return color;
	}

	public Casella getCasella() {
		return casella;
	}

	public void setCasella(Casella casella) {
		this.casella = casella;
	}
	public abstract boolean mossaValida(Scacchiera scacchiera, Casella destinazione);
}

