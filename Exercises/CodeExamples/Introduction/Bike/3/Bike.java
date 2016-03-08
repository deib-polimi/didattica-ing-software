// defines a public class called Bike 
// the name of the class usually starts with an upper case letter
public class Bike {
	
	// The attributes of the class are used to describe the state of the class and are usually private or protected 
	// The attributes of the class usually start with lower case letters
	private int gear; //default 1
	private int cadence; //default 0
	private int speed; //default 0
	
	// is the constructor of the class which allows to create a new Bike
	// the constructor has the same name of the class and does not have a return type
	public Bike(){
	}
	
	public void printState(){
	    // + is the String concatenation operator
	    // the int gear, speed and cadence are automatically converted into String
		System.out.println("gear: "+ gear + ", speed: "+speed+ ", cadence: "+cadence);
	}
}