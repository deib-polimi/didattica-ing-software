package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.Switch;

public class TurnOff extends Action{

	public TurnOff() {
		
	}

	@Override
	public void esegui(Model gioco) {
		gioco.setInterruttore(Switch.OFF);
		this.changePrigioniero(gioco);
	}
}
