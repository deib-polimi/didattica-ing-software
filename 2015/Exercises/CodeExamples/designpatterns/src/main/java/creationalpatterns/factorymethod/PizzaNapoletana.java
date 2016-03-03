package creationalpatterns.factorymethod;

/**
 * contains a specific type of {@link Pizza} and in particular {@link PizzaNapoletana}
 * @author Claudio1
 */
public class PizzaNapoletana extends Pizza {

	/**
	 * creates a new {@link PizzaNapoletana}
	 */
	public PizzaNapoletana(){
		super("Margherita", "Spesso e soffice");
		this.addIngredient("Mozzarella di Bufala");
		this.addIngredient("Basilico Fresco");
	}
}
