package creationalpatterns.singleton;

/**
 * @author Claudio Menghi
 * The {@link SynchronizedLazySingleton} alters the {@link LazySingleton} 
 * to guarantee the correct behavior of the {@link LazySingleton} in case of multithreading 
 */
public class SynchronizedLazySingleton {
	/**
	 * contains the unique instance of the {@link SynchronizedLazySingleton} class
	 */
	private static SynchronizedLazySingleton uniqueInstance;
	
	private SynchronizedLazySingleton(){
		// costruttore
		
	}
	
	/**
	 * returns the pointer to the unique instance of the class. The syncronized attribute guarantees the correct behaviour
	 * is a multithreading environment
	 * @return the pointer to the unique instance of the {@link SynchronizedLazySingleton} class
	 */
	public static synchronized SynchronizedLazySingleton getInstance(){
		// metodi synchronized possono essere inefficienti
		if (uniqueInstance == null){
			uniqueInstance = new SynchronizedLazySingleton();
		}
		return uniqueInstance;
			
	}
}