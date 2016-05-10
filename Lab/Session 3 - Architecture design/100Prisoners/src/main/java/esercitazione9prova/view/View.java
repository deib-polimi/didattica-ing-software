package esercitazione9prova.view;

import esercitazione9prova.Observable;
import esercitazione9prova.Observer;
import esercitazione9prova.model.Model;
import esercitazione9prova.model.actions.Action;
import esercitazione9prova.model.actions.Scommetti;
import esercitazione9prova.model.actions.TurnOff;
import esercitazione9prova.model.actions.TurnOn;
import esercitazione9prova.model.changes.Change;
import esercitazione9prova.model.components.State;
import esercitazione9prova.model.components.Switch;

public class View extends Observable<Action> implements Observer<Change> {

	private final Model gioco;
	public View(Model gioco) {
		gioco.registerObserver(this);
		System.out.println(gioco);
		this.gioco=gioco;
	}

	public void input(String input) {
		System.out.println("I am the view I am notifying my observers");
		Action azione;
		if (input.equals(Switch.ON.toString())) {
			azione = new TurnOn();
		} else {
			if (input.equals(Switch.OFF.toString())) {
				azione = new TurnOff();
			} else {
				
				azione = new Scommetti();
			}
		}
		
		this.notifyObservers(azione);
	}

	public void update() {

		
		System.out.println("I am the view I have been notified by the model ");
		System.out.println(gioco);
	}

	public void update(Change change) {
		Observer.super.update(change);
		System.out.println("I am the view I have been notified by the model with an update C");
		
		if (change.equals(State.WIN)) {
			System.out.println("Avete vinto");
		} else {
			System.out.println("Siete morti");
		}
		System.exit(0);

	}

}