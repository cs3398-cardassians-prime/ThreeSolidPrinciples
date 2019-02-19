package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

public class ProductManager extends Manager
{
	public void defineproduct() {
		int choice = (int)(Math.random() * 9);
		if(choice%3==0)
			System.out.format("The product will need " + (choice+2) + " interfaces.\n");
		else if(choice%3==1)
			System.out.format("The product will need " + (choice+2) + " classes.\n");
		else if(choice%3==2)
			System.out.format("The product will need " + (choice+2) + " objects.\n");
	}
}
