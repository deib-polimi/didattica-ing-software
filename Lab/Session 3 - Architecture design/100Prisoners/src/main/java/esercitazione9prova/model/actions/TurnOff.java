package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.Switch;

public class TurnOff extends Action{

	public TurnOff(Model gioco) {
		super(gioco);
	}

	@Override
	public void esegui() {
		this.getGioco().setInterruttore(Switch.OFF);
		this.getGioco().changePrigioniero();
	}
}
