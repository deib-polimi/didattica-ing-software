/**
 * 
 */
package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.pizza.Pizza;
import creationalpatterns.abstractfactory.pizzafactories.GenovaPizzaIngredientFactory;
import creationalpatterns.abstractfactory.pizzafactories.NapoliPizzaIngredientFactory;

/**
 * @author Claudio1
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates a new GenovaIngridient factory
		GenovaPizzaIngredientFactory genovaFactory=new GenovaPizzaIngredientFactory();
		// creates a new pizza using the ingredients provided by the Genova factory
		Pizza pizzaGenovese=new Pizza(genovaFactory);
		System.out.println(pizzaGenovese);
		
		// creates a new NapoliPizzaIngridient factory
		NapoliPizzaIngredientFactory napoliFactory=new NapoliPizzaIngredientFactory();
		// creates a new pizza using the ingredients provided by a Napoli pizzeria
		Pizza pizzaNapoletana=new Pizza(napoliFactory);
		System.out.println(pizzaNapoletana);
	}
}
