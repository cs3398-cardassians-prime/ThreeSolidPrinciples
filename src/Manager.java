package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;



public class Manager {
		BaseWorker worker;

		public void setWorker(BaseWorker w) {  
			worker = w;
        
		}

		public void manage() {
			worker.work();
        
         
		}
	
}
