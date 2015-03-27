/**
 * 
 */
package creationalpatterns.abstractfactory.pizzafactories;

import creationalpatterns.abstractfactory.ground.Ground;
import creationalpatterns.abstractfactory.ground.SoftGround;
import creationalpatterns.abstractfactory.sauce.Sauce;
import creationalpatterns.abstractfactory.sauce.TomatoSauce;
import creationalpatterns.factorymethod.Pizza;

/**
 * @author Claudio1
 * contains the Factory of a Napoli {@link Pizza}
 */
public class NapoliPizzaIngredientFactory extends PizzaIngredientFactory {

	/**
	 * returns the Ground created in a Genova Pizza Factory which is a {@link SoftGround}
	 * @return a {@link SoftGround}
	 */
	
	@Override
	public Ground createGroud() {
		return new SoftGround();
	}
	/**
	 * returns the {@link Sauce} created in a Genova {@link PizzaIngredientFactory} factory which is a {@link TomatoSauce}
	 * @return a {@link TomatoSauce}
	 */
	
	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

}
