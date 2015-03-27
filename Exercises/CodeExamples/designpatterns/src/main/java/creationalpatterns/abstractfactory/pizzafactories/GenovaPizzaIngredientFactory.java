/**
 * 
 */
package creationalpatterns.abstractfactory.pizzafactories;

import creationalpatterns.abstractfactory.ground.CrispGround;
import creationalpatterns.abstractfactory.ground.Ground;
import creationalpatterns.abstractfactory.sauce.PestoSauce;
import creationalpatterns.abstractfactory.sauce.Sauce;

/**
 * @author Claudio1
 * contains
 */
public class GenovaPizzaIngredientFactory extends PizzaIngredientFactory {

	/**
	 * returns the Ground created in a Genova Pizza Factory which is a {@link CrispGround}
	 * @return a {@link CrispGround}
	 */
	@Override
	public Ground createGroud() {
		Ground ground = new CrispGround();
		return ground;
		
	}
	/**
	 * returns the {@link Sauce} created in a Genova {@link PizzaIngredientFactory} factory which is a {@link PestoSauce}
	 * @return a {@link PestoSauce}
	 */
	@Override
	public Sauce createSauce() {
		PestoSauce sauce=new PestoSauce();
		return sauce;
	}

}
