public class Client2{

	public static void main(String[] args){
		Bike bike1;	//definisce un nuovo referece (puntatore) alla classe Bike con un valore predefinito null
		bike1=new Bike(); //istanzia un oggetto
		// l'istruzione new Bike() crea un nuovo oggetto di tipo Bike e ritorna il referece a questo oggetto che e' ritornato e assegnato alla variabile bike1
		// quando il metodo new e' invocato la Virtual Machine alloca dinamicamente la quantita' di memoria sufficiente a contenere l'oggetto Bike
		Bike bike2=new Bike();
		// definisce e istanzia un oggetto di classe Bike
		System.out.println(bike1==bike2);
		// == confronta i reference bike1 e bike2
	}
}
