//definisce una classe pubblica chiamata Bike
//Il nome della classe DEVE iniziare con una lettera maiuscola
public class Bike2{
	
	// gli attributi della classe sono utilizzati per descrivere lo stato dell'oggetto che verra' istanziato partendo dalla classe corrente e sono solitamente dichiarati privati o protetti.
	// il nome degli attributi inizia con una lettera minuscola
	private int marcia=1; // default 1;
	private int ritmoPedalata; // default 0;
	private int velocita; // default 0;

	// il costruttore della classe permette di creare una nuova bicicletta
	// il costruttore della classe e' un metodo con lo stesso nome della classe che non ha un valore di ritorno
	public Bike(){
	}

	public void printState(){
		// + is the String concatenation operator
		// the int gear, spped and cadence are automatically converted into a String
		System.out.println("gear: "+marcia+", speed: "+velocita+", cadence: "+ritmoPedalata);
	}
}
