package esercitazione9prova.model.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.Prigioniero;

public abstract class Action {

	public Action(){
	}

	public abstract void esegui(Model gioco);
	
	public void changePrigioniero(Model gioco){
		List<Prigioniero> prigionieriList = new ArrayList<Prigioniero>(gioco.getPrigionieri());
		Collections.shuffle(prigionieriList);
		gioco.setPrigioniero(prigionieriList.get(0));

	}
}

