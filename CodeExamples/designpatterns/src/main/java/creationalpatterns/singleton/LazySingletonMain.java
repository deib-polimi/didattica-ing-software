package creationalpatterns.singleton;

public class LazySingletonMain {

	public static void main(String[] args) {
		
		// declares a new instance of LazySingleton 
		LazySingleton lazySing1;
		// declares a new instance of LazySingleton 
		LazySingleton lazySing2;
		
		// gets an instance of an LazySingleton
		lazySing1=LazySingleton.getInstance();
		
		// gets another (the same) instance of an LazySingleton
		lazySing2=LazySingleton.getInstance();
		
		/*
		 *  compare the references of the two objects using ==  
		 */
		if(lazySing1==lazySing2){
			System.out.println("The two references are equals: they point to the same object");
		}
		else{
			System.out.println("The two references are different");
		}
	}
}