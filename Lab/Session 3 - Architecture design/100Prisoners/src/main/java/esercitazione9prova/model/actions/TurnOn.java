package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.Switch;

public class TurnOn extends Action{

	public TurnOn() {
	}

	@Override
	public void esegui(Model gioco) {
		gioco.setInterruttore(Switch.ON);
		this.changePrigioniero(gioco);
	}
}
