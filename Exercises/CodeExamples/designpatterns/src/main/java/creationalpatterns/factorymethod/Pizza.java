/**
 * 
 */
package creationalpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author claudio menghi
 * contains the abstract product
 */
public abstract class Pizza {
	/**
	 * contains the name of the {@link Pizza}
	 */
	private String name;
	/**
	 * contains the sauce used to make the {@link Pizza}
	 */
	private String sauce;
	/**
	 * contains the List of the ingredients of the {@link Pizza}
	 */
	private List<String> ingredients;
	
	/**
	 * creates a new {@link Pizza}
	 * @param name is the name of the {@link Pizza}
	 * @param sauce is the sauce used to make the {@link Pizza}
	 */
	protected Pizza(String name, String sauce){
		this.name=name;
		this.sauce=sauce;
		this.ingredients=new ArrayList<String>();
	}

	/**
	 * add the ingredient ingredient to the {@link Pizza}
	 * @param ingredient is the ingredient to be added to the pizza
	 */
	public void addIngredient(String ingredient){
		if(ingredient==null){
			throw new NullPointerException("The ingredient to be added cannot be null");
		}
		this.ingredients.add(ingredient);
		
	}
	
	public void prepare() {
		System.out.println("Preparazione di Pizza " + name);
		System.out.println("Aggiungi la salsa " + sauce);
		System.out.println("Aggiungi gli ingredienti:" );
		for (String ingrediente: ingredients){
			System.out.println(ingrediente);
		}		
	}
	public void cook(){
		System.out.println("Cotta in forno per 10 minuti");
	}
	public void cut(){
		System.out.println("Taglia la pizza a fette");
	}
	
	public String getNome(){
		return name;
	}

}