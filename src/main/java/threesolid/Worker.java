package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Worker extends BaseWorker implements IEat, ISick{
	public String sick() {
		return "Worker is sick...:-( \n";
	}

	public String eat() {
		return "Worker is eating...:-) \n";
	}
}
