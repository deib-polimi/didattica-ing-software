package creationalpatterns.factorymethod;

/**
 * contains a specific type of {@link Pizza} and in particular {@link PizzaTaggiasca}
 * @author Claudio1
 */
public class PizzaTaggiasca extends Pizza {

	/**
	 * creates a new {@link PizzaTaggiasca}
	 */
	public PizzaTaggiasca(){
		super("Pizza alle Olive", "Sottile e croccante");
		this.addIngredient("Pomodorini");
		this.addIngredient("Olive taggiasche");
	}
}
