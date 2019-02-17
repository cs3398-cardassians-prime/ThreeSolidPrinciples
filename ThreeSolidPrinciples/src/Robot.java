package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;






/*
 * Three principles:
 * 1. Open/Closed: I believe the open/closed principle would be used here by the implementation of
 * an interface for the robot class. Behaviors could be extended using interfaces without 
 * changing the class.
 * 2. Single Responsibility: This class is only responsible for robots.
 * 3. Interface Segregation: This principle is used here in the interface that the Robot class
 * implements. This interface does not include the eat function since robots don't eat.
 */
public class Robot implements IWorkable{
	
		public void work() {
			System.out.format("Robots working 24/7... \n");
		}
	}

