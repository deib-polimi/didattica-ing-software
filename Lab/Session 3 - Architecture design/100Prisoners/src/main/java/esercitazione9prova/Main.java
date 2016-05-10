package esercitazione9prova;

import java.io.IOException;
import java.util.Scanner;


import esercitazione9prova.controller.Controller;
import esercitazione9prova.model.Model;
import esercitazione9prova.view.View;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Model gioco=new Model();
		View view =new View(gioco);
		Controller controller=new Controller(gioco, view);
		
		while(true){
			System.out.println("Dimmi il comando ON/OFF ");
			String comando = in.nextLine();
			view.input(comando);
		}
	}
}