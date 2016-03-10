package esercizio12;

//definisce una classe pubblica chiamata Bike
//Il nome della classe DEVE iniziare con una lettera maiuscola
public class Bike {
	// gli attributi della classe sono utilizzati per descrivere lo stato
	// dell'oggetto che verra' istanziato partendo dalla classe corrente e sono
	// solitamente dichiarati privati o protetti.
	// il nome degli attributi inizia con una lettera minuscola
	private int gear = 1; // default 1;
	private int cadence; // default 0;
	private int speed; // default 0;
	
	// static fields specify that this variable is shared from all the objects of the class
	// the final modified indicates that the value of this field cannot be change
	// the static modifier in combination with the final modifier is also used to define constants
	private static final int MAX_GEAR=6;
	private static final int MIN_GEAR=1;

	// il costruttore della classe permette di creare una nuova bicicletta
	// il costruttore della classe e' un metodo con lo stesso nome della classe
	// che non ha un valore di ritorno

	public Bike() {
	}

	public void printState() {
		// + is the String concatenation operator
		// the int gear, spped and cadence are automatically converted into a
		// String
		System.out.println("gear: " + gear + ", speed: " + speed + ", cadence: " + cadence);
	}
	
	// returns the gear of the bike
	public int getGear(){
		return this.gear;
	}
	
	// returns the cadence of the bike
	public int getCadence(){
		return this.cadence;
	}
	
	// returns the speed of the bike
	public int getSpeed(){
		return this.speed;
	}
	
	// changes the cadence of the bike
	public void changeCadence(int cadence){
		this.cadence=cadence;
		this.updateSpeed();
	}
	// increments the gear
	public void incrementGear(){
		if(gear<MAX_GEAR){
			this.gear++;
			this.updateSpeed();
		}
	}
	
	// decrements the gear
	public void decremendGear(){
		if(gear>MIN_GEAR){
			this.gear--;
			this.updateSpeed();
		}
	}
	
	// updates the speed of the Bike
	private void updateSpeed(){
		this.speed=this.gear*this.cadence;
	}
}
