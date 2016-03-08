package creationalpatterns.singleton;

/**
 * 
 * @author claudio menghi
 * The singleton class ensures that only a unique instance of the class can be ever created
 * Note that 
 * -	the object is created and instantiated before its first use
 * -	if the object is big and it is not used a lot of memory is occupied and not used
 * -	it is thread safe
 */
public class EagerSingleton {

	/**
	 * contains the unique instance of the {@link EagerSingleton} class
	 * if the object is big it can occupy a lot of memory if not used
	 */
	private static EagerSingleton uniqueInstance=new EagerSingleton();
	
	/**
	 * The constructor of the {@link EagerSingleton} class is hided (either private or protected). 
	 * If protected it is possible to call the constructor from the subclasses 
	 */
	private EagerSingleton(){
		
	}
	
	/**
	 * returns the pointer to the unique instance of the class
	 * @return the pointer to the unique instance of the {@link EagerSingleton} class
	 */
	public static EagerSingleton getInstance(){
		return uniqueInstance;
	}
}
