package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

/*
   SOLID principles:
   1. Open Close: the Iworkable and IFeedable interfaces are open to extension 
   (see IWorker interface) but closed to modification (the fundamental 
   operations needed by each interface should not need to be directly changed.)
   
   2. Single Responsibility: applies in that each interface is responsible for
   a single part of functionality.
   
   3. Interface Segregation: the IWorker interface is now split into two small 
   and very focused interfaces.
*/

interface IWorker extends IFeedable, IWorkable {
}

interface IWorkable {
    public void work();
}

interface IFeedable {
    public void eat();
}
