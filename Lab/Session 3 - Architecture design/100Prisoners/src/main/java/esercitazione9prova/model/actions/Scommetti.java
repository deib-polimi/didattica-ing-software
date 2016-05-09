package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.State;

public class Scommetti extends Action{

	public Scommetti(Model gioco) {
		super(gioco);
	}

	@Override
	public void esegui() {
		if(this.getGioco().prigionieriInTheRoom().containsAll(this.getGioco().getPrigionieri())){
			this.getGioco().setState(State.WIN);
		}
		else{
			this.getGioco().setState(State.LOSE);
		}
		
	}
}