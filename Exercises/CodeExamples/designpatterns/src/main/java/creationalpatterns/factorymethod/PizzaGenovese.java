package creationalpatterns.factorymethod;

/**
 * contains a specific type of {@link Pizza} and in particular {@link PizzaGenovese}
 * @author Claudio1
 */
public class PizzaGenovese extends Pizza {

	/**
	 * creates a new {@link PizzaGenovese}
	 */
	public PizzaGenovese() {
		super("Al pesto", "Pesto DOC");
		this.addIngredient("Pomodorini");
		this.addIngredient("Grana a scaglie");
	}
	
}
