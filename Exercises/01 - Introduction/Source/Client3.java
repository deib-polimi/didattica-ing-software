import transport.Bike2;

public class Client3{

	public static void main(String[] args){
		Bike2 bike1;	//definisce un nuovo referece (puntatore) alla classe Bike con un valore predefinito null
		bike1=new Bike2(); //istanzia un oggetto
		// l'istruzione new Bike() crea un nuovo oggetto di tipo Bike e ritorna il referece a questo oggetto che e' ritornato e assegnato alla variabile bike1
		// quando il metodo new e' invocato la Virtual Machine alloca dinamicamente la quantita' di memoria sufficiente a contenere l'oggetto Bike
		Bike2 bike2=new Bike2();
		// definisce e istanzia un oggetto di classe Bike
		System.out.println(bike1==bike2);
		// == confronta i reference bike1 e bike2
		bike1.printState();
		// invoca il metodo printState sull'oggetto bike1
	}
}
