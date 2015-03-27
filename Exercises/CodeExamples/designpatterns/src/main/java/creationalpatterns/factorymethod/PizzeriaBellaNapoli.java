package creationalpatterns.factorymethod;

/**
 * is a concrete Creator.
 * It overrides the factory method of the Creator. 
 * The Factory Method of the ConcreteCreator returns the ConcreteProduct (the concrete pizza). 
 * It uses the ConcreteProduct class {@link PizzaNapoletana} 
 * @author Claudio1
 *
 */
public class PizzeriaBellaNapoli extends Pizzeria {

	@Override
	public Pizza createPizza(String type) {
		if(!type.equals("margherita")){
			throw new IllegalArgumentException("The pizza "+type+" is not available in the PizzeriaBellaNapoli");
		}
		return new PizzaNapoletana();
	}
}
