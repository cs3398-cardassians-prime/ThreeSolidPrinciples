package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.*;

/*
1. Open/Closed:Does not apply.

2. Single Responsibility: The main is only responsible for creating the Manager and any exception handling.


3. Interface Segregation: Does not apply.
*/

public class ThreeSolidMain
{   

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
      
      try 
      {
         System.out.format("Starting ... \n"); 
         tsManager.setWorker(new SuperWorker());
         tsManager.manage();
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
}

