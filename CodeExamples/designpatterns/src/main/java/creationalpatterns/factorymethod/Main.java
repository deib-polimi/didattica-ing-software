package creationalpatterns.factorymethod;

public class Main {

	public static void main(String[] args) {
		Pizzeria bellaNapoli = new PizzeriaBellaNapoli();
		Pizzeria cinqueTerre = new PizzeriaCinqueTerre();
		
		Pizza pizza = bellaNapoli.orderPizza("margherita");
		System.out.println("Valerio ha ordinato la pizza " + pizza.getNome());
		System.out.println("###############");
		
		pizza = cinqueTerre.orderPizza("pesto");
		System.out.println("Carlo ha ordinato la pizza " + pizza.getNome());
	}
}
