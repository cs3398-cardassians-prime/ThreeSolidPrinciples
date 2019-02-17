package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;


/*
 * Three principles:
 * 1. Open/Closed: The manger class doesn't 100% display the Open/closed principle due to the fact that this class is never directly 
 * messed with, when trying to change the the worker class.  
 * 2. Single Responsibility: while this class does have 2 separate responsibilities in the fact that it creates workers and also manages,
 * them,  but these both could be viewed as the responsibilites of a manager,
 * 3. Interface Segregation: This principle is not explicitly used in this class.
 */

public class Manager {
		IWorkable worker;

		public void setWorker(IWorkable w) {   /// changed from Workable to IWorkable
			worker = w;
        
		}

		public void manage() {
			worker.work();
         //worker.eat();
         
		}
	
}
