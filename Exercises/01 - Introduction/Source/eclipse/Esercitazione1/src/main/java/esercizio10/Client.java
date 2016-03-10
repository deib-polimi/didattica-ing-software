package esercizio10;

public class Client {

	public static void main(String[] args) {
		
		Bike bike1;
		
		bike1=new Bike();
		
		Bike bike2=new Bike();
		
		// == compare the reference of the Bike1 with the reference of Bike2
		System.out.println(bike1==bike2);
		
		// invoca il metodo print state su Bike1
		bike1.printState();
		
		// invoca il metodo print state su Bike2
		bike2.printState();
		
		System.out.println(bike1.getCadence());

	}

}
