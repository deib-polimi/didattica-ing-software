/**
 * 
 */
package creationalpatterns.abstractfactory.pizzafactories;

import creationalpatterns.abstractfactory.ground.Ground;
import creationalpatterns.abstractfactory.sauce.Sauce;

/**
 * @author Claudio1
 * is a factory which returns the ingredients of a particular pizza
 */
public abstract class PizzaIngredientFactory {
	/**
	 * returns the {@link Ground} of the pizza
	 * @return the {@link Ground} of the pizza
	 */
	public abstract Ground createGroud();
	/**
	 * returns the {@link Sauce} to be added in the pizza
	 * @return the {@link Sauce} to be added in the pizza
	 */
	public abstract Sauce createSauce();
}
