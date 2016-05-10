package esercitazione9prova.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import esercitazione9prova.Observable;
import esercitazione9prova.model.changes.Change;
import esercitazione9prova.model.changes.StateChange;
import esercitazione9prova.model.components.Prigioniero;
import esercitazione9prova.model.components.State;
import esercitazione9prova.model.components.Switch;

public class Model extends Observable<Change> {

	private Set<Prigioniero> prigionieri;
	private Set<Prigioniero> prigionieriInTheRoom;
	private Prigioniero currentPrigioniero;
	private Switch interruttore;
	private State gameState;

	public Model() {
		prigionieri = new HashSet<Prigioniero>();
		prigionieriInTheRoom = new HashSet<Prigioniero>();
		this.addPrigioniero(new Prigioniero("Luca"));
		this.addPrigioniero(new Prigioniero("Pierluigi"));
		this.addPrigioniero(new Prigioniero("Carlo"));
		this.interruttore = Switch.OFF;
		gameState = State.RUNNING;
		this.setPrigioniero(this.prigionieri.iterator().next());
	}

	public void setState(State state) {
		this.gameState = state;


		this.notifyObservers(new StateChange(this.gameState));
	}

	public void addPrigioniero(Prigioniero prigioniero) {
		currentPrigioniero = prigioniero;
		this.prigionieri.add(prigioniero);
	}

	public Switch getInterruttore() {
		return interruttore;
	}

	public Set<Prigioniero> getPrigionieri() {
		return Collections.unmodifiableSet(this.prigionieri);
	}

	public Set<Prigioniero> prigionieriInTheRoom() {
		return Collections.unmodifiableSet(this.prigionieriInTheRoom);
	}

	public void setInterruttore(Switch value) {
		this.interruttore = value;

	}

	public void setPrigioniero(Prigioniero prigioniero) {
		this.currentPrigioniero = prigioniero;
		this.prigionieriInTheRoom.add(currentPrigioniero);
		
		this.notifyObservers();
	}

	

	@Override
	public String toString() {
		return "Gioco [currentPrigioniero=" + currentPrigioniero + ", interruttore=" + interruttore + "]";
	}
}