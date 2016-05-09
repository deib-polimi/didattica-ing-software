package esercitazione9prova.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import esercitazione9prova.Observable;
import esercitazione9prova.model.components.Prigioniero;
import esercitazione9prova.model.components.State;
import esercitazione9prova.model.components.Switch;

public class Model extends Observable{

	private Set<Prigioniero> prigionieri;
	private Set<Prigioniero> prigionieriInTheRoom;
	private Prigioniero currentPrigioniero;
	private Switch interruttore;
	private State gameState;
	
	public Model() {
		prigionieri=new HashSet<Prigioniero>();
		prigionieriInTheRoom=new HashSet<Prigioniero>();
		this.addPrigioniero(new Prigioniero("Luca"));
		this.addPrigioniero(new Prigioniero("Pietro"));
		this.addPrigioniero(new Prigioniero("Paolo"));
		this.interruttore=Switch.OFF;
		gameState=State.RUNNING;
		this.changePrigioniero();
	}
	
	public void setState(State state){
		this.gameState=state;
		System.out.println("I am the model I am notifying my observers with a new game state");
		
		this.notifyObservers(gameState);
	}
	
	public void addPrigioniero(Prigioniero prigioniero){
		currentPrigioniero=prigioniero;
		this.prigionieri.add(prigioniero);
	}

	public Switch getInterruttore() {
		return interruttore;
	}
	
	public Set<Prigioniero> getPrigionieri(){
		return Collections.unmodifiableSet(this.prigionieri);
	}
	public Set<Prigioniero> prigionieriInTheRoom(){
		return Collections.unmodifiableSet(this.prigionieriInTheRoom);
	}
	
	
	public void setInterruttore(Switch value){
		this.interruttore=value;

	}
	
	public void changePrigioniero(){
		List<Prigioniero> prigionieriList=new ArrayList<Prigioniero>(prigionieri);
		Collections.shuffle(prigionieriList);
		this.currentPrigioniero=prigionieriList.get(0);
		this.prigionieriInTheRoom.add(currentPrigioniero);
		System.out.println("I am the model I am notifying my observers");
		
		this.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Gioco [currentPrigioniero=" + currentPrigioniero
				+ ", interruttore=" + interruttore + "]";
	}
}