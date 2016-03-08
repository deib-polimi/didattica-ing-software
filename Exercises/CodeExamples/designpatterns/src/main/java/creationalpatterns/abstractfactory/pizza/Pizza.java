/**
 * 
 */
package creationalpatterns.abstractfactory.pizza;

import creationalpatterns.abstractfactory.ground.Ground;
import creationalpatterns.abstractfactory.pizzafactories.PizzaIngredientFactory;
import creationalpatterns.abstractfactory.sauce.Sauce;

/**
 * @author Claudio1
 * contains the abstract of a Pizza represents a client which is using the {@link PizzaIngredientFactory}
 * 
 */
public class Pizza {
	/**
	 * contains the ground of the {@link Pizza}
	 */
	private Ground ground;
	/**
	 * contains the {@link Sauce} of the {@link Pizza}
	 */
	private Sauce sauce;
	
	/**
	 * creates a new {@link Pizza} with the specified {@link Ground} and {@link Sauce}
	 * @param ground is the {@link Ground} of the {@link Pizza}
	 * @param sauce is the {@link Sauce} of the {@link Pizza}
	 */
	private Pizza(Ground ground, Sauce sauce){
		this.ground=ground;
		this.sauce=sauce;
	}
	
	/**
	 * creates a new {@link Pizza} with the specified {@link PizzaIngredientFactory}
	 * @param factory is the factory which is used to create the {@link Pizza}
	 */
	public Pizza(PizzaIngredientFactory factory){
		this(factory.createGroud(), factory.createSauce());
	}
	/**
	 * returns the {@link String} representation of the {@link Pizza}
	 */
	public String toString(){
		return "ground: "+this.ground.toString()+" \t sauce: "+this.sauce.toString();
	}
}
