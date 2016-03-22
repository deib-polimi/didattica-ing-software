package scacchi.scacchiera;

import scacchi.scacchiera.pezzi.Alfiere;
import scacchi.scacchiera.pezzi.Cavallo;
import scacchi.scacchiera.pezzi.Donna;
import scacchi.scacchiera.pezzi.Pedone;
import scacchi.scacchiera.pezzi.Pezzo;
import scacchi.scacchiera.pezzi.Re;
import scacchi.scacchiera.pezzi.Torre;

public class Scacchiera {

	/**
	 * 8x8 Matrix of caselle
	 */
	private final Casella[][] caselle;
	private static final int SIZE = 8;

	/**
	 * Constructor for Scacchiera, initializes all the fields.
	 */
	public Scacchiera() {
		// initialize fields

		caselle = new Casella[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				caselle[i][j] = new Casella(new Coordinata(i, j));
			}
		}

		this.intializeReRow(0, Color.WHITE);
		this.intializePedoniRow(1, Color.WHITE);
		this.intializePedoniRow(6, Color.BLACK);
		this.intializeReRow(7, Color.BLACK);

	}

	private void intializePedoniRow(int row, Color color) {
		for (int i = 0; i < SIZE; i++) {
			Pezzo pedone = new Pedone(caselle[row][i], color);
			caselle[row][i].setPezzo(pedone);
		}
	}

	private void intializeReRow(int row, Color color) {
		Pezzo torreBianca1 = new Torre(caselle[row][0], color);
		caselle[row][0].setPezzo(torreBianca1);
		Pezzo cavalloBianca1 = new Cavallo(caselle[row][1], color);
		caselle[row][1].setPezzo(cavalloBianca1);
		Pezzo alfiereBianca1 = new Alfiere(caselle[row][2], color);
		caselle[row][2].setPezzo(alfiereBianca1);
		Pezzo reBianco = new Re(caselle[row][3], color);
		caselle[row][3].setPezzo(reBianco);
		Pezzo reginaBianco = new Donna(caselle[row][4], color);
		caselle[row][4].setPezzo(reginaBianco);
		Pezzo alfiereBianca2 = new Alfiere(caselle[row][5], color);
		caselle[row][5].setPezzo(alfiereBianca2);
		Pezzo cavalloBianco2 = new Cavallo(caselle[row][6], color);
		caselle[row][6].setPezzo(cavalloBianco2);
		Pezzo torreBianca2 = new Torre(caselle[row][7], color);
		caselle[row][7].setPezzo(torreBianca2);
	}

	public Casella getCasella(Coordinata coordinata) {
		return this.caselle[coordinata.getX()][coordinata.getY()];
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String ret = "";
		ret += "---------------------------------------------------";
		ret += "------------------------------------------------\n";
		for (int i = 0; i < SIZE; i++) {
			ret += "| ";
			for (int j = 0; j < SIZE; j++) {
				ret += caselle[i][j].toString();
				ret += " | ";
			}
			ret += "\n";
			ret += "------------------------------------------------\n";
			ret += "---------------------------------------------------";
		}
		ret += "\n ";
		return ret;
	}
}
