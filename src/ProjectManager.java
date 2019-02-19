package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

public class ProjectManager extends Manager
{
	public void schedulework() {
		int choice = (int)(Math.random() * 9);
		if(choice%3==0)
			System.out.format("Our schedule allows for everyone to take friday off.\n");
		else if(choice%3==1)
			System.out.format("Sorry but our schedule requires everyone to work an extra hour on weekdays.\n");
		else if(choice%3==2)
			System.out.format("Goob job everyone, we're so far ahead of schedule that everyone gets to leave early today.\n");
	}
}
