package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class TempWorker extends BaseWorker implements IEat, ISick{
	public String work() {
		return "I'm just a TempWorker temporarily working here... \n";
	}

   public String sick() {
		return "I can't afford get to get sick since I'm a TempWorker... \n";
	}
	public String eat() {
		return "I am just temporarily eating... \n";
	}
}
