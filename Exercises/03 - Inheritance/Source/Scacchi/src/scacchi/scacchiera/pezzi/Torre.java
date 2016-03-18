package scacchi.scacchiera.pezzi;

import scacchi.scacchiera.Casella;
import scacchi.scacchiera.Color;
import scacchi.scacchiera.Coordinata;
import scacchi.scacchiera.Scacchiera;

public class Torre extends Pezzo {

	public Torre(Casella casella, Color color) {
		super(casella, color);
	}

	@Override
	public boolean mossaValida(Scacchiera scacchiera, Casella destinazione) {
		if (destinazione != null) {
			// se la casella destinazione non \`e vuota e \`e presente un Pezzo dello stesso
			// colore ritorna falso
			if (!destinazione.isEmpty()
					&& destinazione.getPezzo().getColor() == this.getColor()) {
				return false;
			}
			// se la riga o la colonna non e' costante ritorno false
			int deltaX=destinazione.getCoordinata().getX()-this.getCasella().getCoordinata().getX();
			int deltaY=destinazione.getCoordinata().getY()-this.getCasella().getCoordinata().getY();
			if(!((deltaX==0)||(deltaY==0))){
				return false;
			}
			if(deltaY==0){
				// controlla tutte le caselle sulla diagonale, se in una di queste c'e' un pezzo ritorna false
				for(int i=1;i<Math.abs(deltaX);i++){
					if(!scacchiera.getCasella(new Coordinata(this.getCasella().getCoordinata().getX() +i, this.getCasella().getCoordinata().getY())).isEmpty()){
						return false;
					}
				}
			}
			if(deltaX==0){
				for(int i=1;i<Math.abs(deltaX);i++){
					if(!scacchiera.getCasella(new Coordinata(this.getCasella().getCoordinata().getX(), this.getCasella().getCoordinata().getY()+i)).isEmpty()){
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "T ["+this.getColor()+"]";
	}
}
