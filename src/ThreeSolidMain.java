package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.*;

/*
1. Open/Closed:Does not apply.

2. Single Responsibility: The main is only responsible for creating of the classes and calling the methods in the class 
3. Interface Segregation: Does not apply.
*/

public class ThreeSolidMain
{   
   public static ProductManager tsProductManager = new ProductManager();
   public static ProjectManager tsProjectManager = new ProjectManager();
   public static Worker tsWorker= new Worker();
   public static SuperWorker tsSuperWorker= new SuperWorker();
   public static TempWorker tsTempWorker = new TempWorker();
   public static Robot tsRobot = new Robot();
   
   // The entry main() method
   public static void main(String[] args) 
   {
      
      try 
      {
         System.out.format("Starting ... \n"); 
         
         tsProductManager.defineproduct();
         tsProjectManager.schedulework();
      
        
         tsWorker.work();
         
         tsTempWorker.work();
         tsTempWorker.eat();
         tsTempWorker.sick();
         
         tsSuperWorker.work();
         tsSuperWorker.sick();
         tsSuperWorker.eat();
                  
         tsRobot.work();
         tsRobot.reboot();
         
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

