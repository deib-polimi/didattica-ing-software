public class Client {
	
	public static void main(String[] args)
    {
        Bike bike1; 
        bike1 = new Bike();
        Bike bike2 = new Bike(); 
        
        // == compare the reference of the Bike1 with the reference of the Bike2
        System.out.println(bike1==bike2);
     }
}