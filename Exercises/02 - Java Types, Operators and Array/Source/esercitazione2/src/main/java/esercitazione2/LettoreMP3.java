package esercitazione2;

public class LettoreMP3 {
	
	//Contatore condiviso tra tutte le istanze
	private static int counter = 0;
	
	// contiene il codice seriale dell LettoreMP3
	private final int serialNumber;
	
	// contiene la memoria del lettore MP3
	private final int memoria;	
	
	//Crea un nuovo LettoreMP3. Il costruttore potrebbe anche prendere come parametro un colore...
	public LettoreMP3(int memoria){
	    serialNumber=counter;
	    counter=counter+1;
	    this.memoria=memoria;
	}
	// ACCESSORI
	// ritorna il serial number dello LettoreMP3
	public int getSN() {
	    return serialNumber;
	}
	public int getMemoria(){
	    return this.memoria;
	}
	public void ascolta(){
	    System.out.println("Track: 01");
	}	
	// nota il metodo toString puo' essere generato automaticamente in eclipse sfruttando source > generateToString();
	@Override
	public String toString(){
	    return serialNumber + " of " + counter;
	}
}