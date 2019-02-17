package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Worker implements IWorker{
	public void work() {
		System.out.format("Working...from IWorker \n");
	}

	public void eat() {
		System.out.format("Eating...from IWorker \n");
	}
}
