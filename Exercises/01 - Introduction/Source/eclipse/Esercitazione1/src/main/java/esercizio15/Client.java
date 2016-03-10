package esercizio15;

public class Client {

	public static void creatingANewBike() {
		// dichiaro una variabile di tipo reference con identificativo bike1
		Bike bike1;
		// creo un nuovo oggetto di tipo Bike e assegno il reference ritornato
		// alla variabile bike1
		bike1 = new Bike(4, 5);
	}

	public static void main(String[] args) {

		// dichiaro una variabile di tipo reference con identificativo bike1
		Bike bike1;
		// creo un nuovo oggetto di tipo Bike e assegno il reference ritornato
		// alla variabile bike1
		bike1 = new Bike(4, 5);
		// creo un nuovo oggetto di tipo Bike e assegno il reference ritornato
		// alla variabile bike2
		Bike bike2 = new Bike(2, 3);

		// vengono stampati due reference diversi relativi alle variabili bike1
		// e bike2
		System.out.println(bike1);
		System.out.println(bike2);

		// copia il reference contenuto nella variabile bike2 nella variabile
		// bike1

		bike1 = bike2;

		// vengono stampati i due reference
		System.out.println(bike1);
		System.out.println(bike2);
		
		creatingANewBike();
    }
}