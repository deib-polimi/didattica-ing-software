package creationalpatterns.singleton;


public class SynchronizedLasySingletonMain {
	private static SynchronizedLazySingleton singleton = null;
	
	   public static void main(String[] args) throws InterruptedException {
			
		   // Both threads call Singleton.getInstance().
	      Thread threadOne = new Thread(new SingletonRunnable());
	      Thread threadTwo = new Thread(new SingletonRunnable());
	      threadOne.start();
	      threadTwo.start();
	      threadOne.join();
	      threadTwo.join();
	   }
	   private static class SingletonRunnable implements Runnable {
	      public void run() {
	    	 /*
	    	  * add 
	    	  * try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				in the constructor of the LazySingleton 
	    	  */
	         // Get a reference to the singleton.
	    	  SynchronizedLazySingleton s = SynchronizedLazySingleton.getInstance();
	         // Protect singleton member variable from
	         // multithreaded access.
	         synchronized(SynchronizedLazySingleton.class) {
	            if(singleton == null) // If local reference is null...
	               singleton = s;     // ...set it to the singleton
	         }
	         // Local reference must be equal to the one and
	         // only instance of Singleton; otherwise, we have two
	                  // Singleton instances.
	         if(s==singleton){
	        	 System.out.printf("The local reference is equal to singleton\n");
	         }
	         else{
	        	 System.out.printf("The local reference is not equal to the singleton\n");
	         }
	      }
	   }
}
