package com.singleton;

public class BillPughSingleton {
     
     
     private BillPughSingleton() {
    	 
     }
     
     /*
      * Based on princliple of Initialization-on-demand holder idiom
      * 
      * This also uses static block but in a different way- Use inner static inner class.
      * the private inner static class contains the instance of the singleton class
      * When the singleton class is loaded, the SingletonHelper class is not loaded into memory,
      * and only when someone calls the getInstance method,
      * does this class get loaded and create the Singleton class instance
      * It does not require syncronization and is easy to implement.
      */
     
     private static class BillPughSingletonHelper{
    	 private static BillPughSingleton sObj = new BillPughSingleton();
     }
     
     
     public static BillPughSingleton getInstance(){
         return BillPughSingletonHelper.sObj;
     }
}
