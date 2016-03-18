package scacchi;

import scacchi.scacchiera.Color;

public class Player {

	private final Color color;
	
	public Player(Color color){
		this.color=color;
	}

	@Override
	public String toString() {
		return "Player [color=" + color + "]";
	}

	public Color getColor() {
		return color;
	}
}