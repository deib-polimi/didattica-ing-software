package esercitazione9prova.model.actions;

import esercitazione9prova.model.components.Switch;

public class ActionFactory {

	public Action createActions(String input){
		String inputUPPER=input.toUpperCase();
		Action azione;
		if (inputUPPER.equals(Switch.ON.toString())) {
			azione = new TurnOn();
		} else {
			if (inputUPPER.equals(Switch.OFF.toString())) {
				azione = new TurnOff();
			} else {
				azione = new Scommetti();
			}
		}
		return azione;
	}
}
