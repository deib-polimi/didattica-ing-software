package esercitazione9prova.view;

import esercitazione9prova.Observable;
import esercitazione9prova.Observer;
import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.State;

public class View extends Observable implements Observer {

	private final Model gioco;
	public View(Model gioco) {
		gioco.registerObserver(this);
		System.out.println(gioco);
		this.gioco=gioco;
	}

	public void input(String input) {
		System.out.println("I am the view I am notifying my observers");
		this.notifyObservers(input);
	}

	public void update() {
		System.out.println("I am the view I have been notified by the model ");
		System.out.println(gioco);
	}

	public <C> void update(C change) {
		System.out.println("I am the view I have been notified by the model with an update C");
		
		if (change.equals(State.WIN)) {
			System.out.println("Avete vinto");
		} else {
			System.out.println("Siete morti");
		}
		System.exit(0);

	}

}