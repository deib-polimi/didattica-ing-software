package esercizio14;

public class Client {

	public static void main(String[] args) {

		Bike bike1;
		bike1 = new Bike(3, 2);
		Bike bike2 = new Bike(1, 2);

		// == compare the reference of the Bike1 with the reference of the Bike2
		System.out.println(bike1 == bike2);
		// invokes the method print state of the object bike1
		bike1.printState();
		// invokes the method print state of the object bike2
		bike2.printState();

		bike1.printState();
		bike1.incrementGear();
		bike1.printState();
		bike1.changeCadence(10);
		bike1.printState();
	    }
}