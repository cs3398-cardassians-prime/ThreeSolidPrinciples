package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

abstract class BaseWorker {
	public String work() {
		return "Working...from BaseWorker\n";
	}
}
