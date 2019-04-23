package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Worker extends BaseWorker implements IEat, ISick{
	public void sick() {
		System.out.format("Worker is sick...:-( \n");
	}

	public void eat() {
		System.out.format("Worker is eating...:-) \n");
	}
}
