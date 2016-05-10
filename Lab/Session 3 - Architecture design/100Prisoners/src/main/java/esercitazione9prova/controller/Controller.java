package esercitazione9prova.controller;

import esercitazione9prova.Observer;
import esercitazione9prova.model.Model;
import esercitazione9prova.model.actions.Action;
import esercitazione9prova.view.View;

public class Controller implements Observer<Action> {

	private final Model gioco;

	public Controller(Model gioco, View view) {
		this.gioco = gioco;
		view.registerObserver(this);
	}

	public  void update(Action action) {
		Observer.super.update(action);
		action.esegui(this.gioco);
	}

	public void update() {

	}
}