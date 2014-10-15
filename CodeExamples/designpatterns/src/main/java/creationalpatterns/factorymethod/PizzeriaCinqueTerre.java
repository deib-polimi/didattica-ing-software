package creationalpatterns.factorymethod;

/**
 * is a concrete Creator.
 * It overrides the factory method of the Creator. 
 * The Factory Method of the ConcreteCreator returns the ConcreteProduct (the concrete pizza). 
 * It uses the ConcreteProduct class {@link PizzaGenoveses} 
 * @author Claudio1
 *
 */
public class PizzeriaCinqueTerre extends Pizzeria {

	@Override
	protected Pizza createPizza(String type) {
		switch(type){
			case "pesto":
				return new PizzaGenovese();
			case "olive":
				return new PizzaTaggiasca();
			default: 
				throw new IllegalArgumentException("The pizza "+type+" is not available in the PizzeriaCinqueTerre");
		}
	}
}
