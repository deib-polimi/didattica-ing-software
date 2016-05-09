package esercitazione9prova.controller;

import esercitazione9prova.Observer;
import esercitazione9prova.model.Model;
import esercitazione9prova.model.actions.Action;
import esercitazione9prova.model.actions.Scommetti;
import esercitazione9prova.model.actions.TurnOff;
import esercitazione9prova.model.actions.TurnOn;
import esercitazione9prova.model.components.Switch;
import esercitazione9prova.view.View;

public class Controller implements Observer {

	private final Model gioco;

	public Controller(Model gioco, View view) {
		this.gioco = gioco;
		view.registerObserver(this);
	}

	public <C> void update(C change) {
		System.out.println("I am the controller I have been notified by the view with an action C");
		Action azione;
		if (change.equals(Switch.ON.toString())) {
			azione = new TurnOn(this.gioco);
		} else {
			if (change.equals(Switch.OFF.toString())) {
				azione = new TurnOff(gioco);
			} else {
				
				azione = new Scommetti(gioco);
			}
		}
		azione.esegui();
	}

	public void update() {
		System.out.println("I am the controller I have been notified by the view");

	}
}