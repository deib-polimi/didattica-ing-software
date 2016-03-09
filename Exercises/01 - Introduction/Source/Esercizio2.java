import java.util.Scanner;

public class Esercizio2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci il tuo nome");
		String nome=scanner.nextLine();
		scanner.close();
		String welcome="Benvenuto al corso di Ingegneria del Software";
		System.out.println("Ciao "+nome+", "+welcome);
	}	
}
