/**
 * 
 */
package esercitazione9prova.model.changes;

import esercitazione9prova.model.components.State;

/**
 * @author Claudio Menghi
 *
 */
public class StateChange extends Change {

	private final State newState;
	
	public StateChange(State newState){
		this.newState=newState;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StateChange [newState=" + newState + "]";
	}
	
	
}
