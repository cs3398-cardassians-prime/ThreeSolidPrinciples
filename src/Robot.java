package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

public class Robot extends BaseWorker implements IReboot{
	
		public void reboot() {
			System.out.format("Robot rebooting... \n");
		}
	}

