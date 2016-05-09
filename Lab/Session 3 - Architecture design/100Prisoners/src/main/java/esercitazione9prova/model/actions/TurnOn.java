package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.Switch;

public class TurnOn extends Action{

	public TurnOn(Model gioco) {
		super(gioco);
	}

	@Override
	public void esegui() {
		this.getGioco().setInterruttore(Switch.ON);
		this.getGioco().changePrigioniero();
	}
}
