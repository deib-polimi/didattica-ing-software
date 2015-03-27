/**
 * 
 */
package creationalpatterns.factorymethod;

/**
 * is the creator:  an abstract class with an abstract public or protected factory method. 
 * If a default implementation is provided the method is not abstract. It uses the Abstract class Product
 * @author Claudio1
 *
 */
public abstract class Pizzeria {

	/**
	 * is a public method which allows to create the pizza
	 * @param type is the type of the pizza which is ordered
	 * @return the ordered pizza
	 */
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.cook();
		pizza.cut();
		return pizza;
	}
	/**
	 * is the factory method
	 * @param type is the type of the pizza require
	 * @return the pizza required
	 * @throws IllegalArgumentException if the specific type of pizza is not available
	 */
	protected abstract Pizza createPizza(String type);
}
