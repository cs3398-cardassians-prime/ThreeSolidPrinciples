package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class SuperWorker implements IWorker{
	public void work() {
		System.out.format("Super workers cant stop,wont stop \n");
	}

	public void eat() {
		System.out.format("SuperWorkers shovel their food in order to get back to work \n");
	}
}