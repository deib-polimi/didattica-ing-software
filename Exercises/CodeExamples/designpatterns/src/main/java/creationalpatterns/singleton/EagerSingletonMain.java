package creationalpatterns.singleton;

/**
 * this class shows an example of use of the EagerSingleton pattern
 * @author claudio menghi
 *
 */
public class EagerSingletonMain {

	public static void main(String[] args) {
		
		// declares a new instance of EagerSingleton 
		EagerSingleton eagerSing1;
		// declares a new instance of EagerSingleton 
		EagerSingleton eagerSing2;
		
		// gets an instance of an EagerSingleton
		eagerSing1=EagerSingleton.getInstance();
		
		// gets another (the same) instance of an EagerSingleton
		eagerSing2=EagerSingleton.getInstance();
		
		/*
		 *  compare the references of the two objects using ==  
		 */
		if(eagerSing1==eagerSing2){
			System.out.println("The two references are equals: they point to the same object");
		}
		else{
			System.out.println("The two references are different");
		}
	}
}
