package esercizio14;

//defines a public class called Bike 
//the name of the class usually starts with an upper case letter
public class Bike {

	// static specifies that this variable is shared from all the objects
	// The final modifier indicates that the value of this field cannot change.
	// The static modifier, in combination with the final modifier, is also used to define constants. 
	private static final int MAX_GEAR = 6;
	private static final int MIN_GEAR = 1;

	// The attributes of the class are used to describe the state of the class
	// and are usually private or protected
	// The attributes of the class usually start with lower case letters
	private int gear = 1; // default 1
	private int cadence; // default 0
	private int speed; // default 0

	// is the constructor of the class which allows to create a new Bike
	// the constructor has the same name of the class and does not have a return
	// type
	// gear and cadence are the intial values of the gear and the cadence
	public Bike(int gear, int cadence) {
		
		// this allows to refer to the variable gear of THIS class, otherwise gear refers to the variable passed as parameter
		this.gear=gear;
		this.cadence=cadence;
		this.updateSpeed();
	}

	public void printState() {
		// + is the String concatenation operator
		// the int gear, speed and cadence are automatically converted into
		// String
		System.out.println("gear: " + gear + ", speed: " + speed
				+ ", cadence: " + cadence);
	}

	// changes the cadence of the bike
	public void changeCadence(int cadence) {
		this.cadence = cadence;
		updateSpeed();
	}

	// increment the gear
	public void incrementGear() {
		if (gear < MAX_GEAR) {
			gear++;
			updateSpeed();
		}
	}

	// decrement the gear
	public void decrementGear() {
		if (gear > MIN_GEAR) {
			gear--;
			updateSpeed();
		}
	}

	// every time the cadence or the gear changes the speed is updated
	// the method is private and cannot be invoked from other external classes
	private void updateSpeed() {
		this.speed = this.gear * this.cadence;
	}

	// returns the gear of the bike
	public int getGear() {
		return this.gear;
	}

	// returns the cadence of the bike
	public int getCadence() {
		return this.cadence;
	}

	// returns the speed ok the bike
	public int getSpeed() {
		return this.speed;
	}
}
