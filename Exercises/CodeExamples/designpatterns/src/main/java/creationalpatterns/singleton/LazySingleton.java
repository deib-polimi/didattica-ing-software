package creationalpatterns.singleton;

/**
 * @author Claudio Menghi
 * The singleton class ensures that only a unique instance of the class can be ever created
 * Note that 
 * -	the object is instantiated only when needed
 * -	it does not occupy additional memory as the {@link EagerSingleton}
 * -	it is NOT THREAD safe -> it does not work for multithreads applications
 */
public class LazySingleton {
	
	/**
	 * contains the unique instance of the {@link LazySingleton} class
	 */
	private static LazySingleton uniqueInstance;
	// other attributes
	
	/**
	 * The constructor of the {@link LazySingleton} class is hided (either private or protected). 
	 * If protected it is possible to call the constructor from the subclasses 
	 */
	private LazySingleton(){
		// initialization of other attributes
	}
	
	/**
	 * returns the pointer to the unique instance of the class
	 * @return the pointer to the unique instance of the {@link LazySingleton} class
	 */
	public static LazySingleton getInstance(){
		
		// if the instance has not already been created,  the new instance is created
		if(uniqueInstance==null){
			
			uniqueInstance=new LazySingleton();
		}
		// the instance is returned
		return uniqueInstance;
	}	
}
