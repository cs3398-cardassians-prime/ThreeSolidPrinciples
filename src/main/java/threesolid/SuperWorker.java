package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class SuperWorker extends BaseWorker implements IEat, ISick{
	public void work() {
		System.out.format("SuperWorker cant stop,wont stop...\n");
	}
   
   public void sick() {
		System.out.format("SuperWorker doesn't get sick... \n");
	}

	public void eat() {
		System.out.format("SuperWorker doesn't have to eat...:-) \n");
	}
}