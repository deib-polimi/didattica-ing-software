package esercizio17;

public class ArrayOfBikes {
	private static void printFastBikes(Bike [] bikes){
		for (Bike bike: bikes){
			if (bike != null && bike.getSpeed() > 10)
				bike.printState();
		}
	}
	public static void main(String [] args){
		// definiamo una dimensione fissa 
		// tutti gli elementi degli array hanno valore null
		Bike [] arr1 = new Bike[10]; 
		Bike [] arr2 = new Bike[10];
		
		arr1[0] = new Bike(3, 20);
		arr1[1] = new Bike(3, 10);
		arr1[2] = new Bike(1, 1);
		System.out.println("Print fast bikes in arr1");
		printFastBikes(arr1);
		int k = 0;
		for (Bike b: arr1){
			if (b!= null){
				Bike b2 = new Bike(b.getGear(),b.getSpeed());
				b2.changeCadence(b2.getCadence() + 5);
				arr2[k++] = b2;
			}				
		}
		System.out.println("Print fast bikes in arr2");
		printFastBikes(arr2);
	}
}