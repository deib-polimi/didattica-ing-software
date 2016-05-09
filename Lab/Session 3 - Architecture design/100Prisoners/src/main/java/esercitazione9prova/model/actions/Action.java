package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;

public abstract class Action {

	private final Model gioco;
	
	public Action(Model gioco){
		this.gioco=gioco;
	}
	
	protected Model getGioco(){
		return this.gioco;
	}
	
	public abstract void esegui();
}
