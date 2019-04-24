 package threesolid; 
 
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
 import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;

import javafx.concurrent.Worker; 
 
 
public class TestWorker {
	private  Worker<V> w = new Worker();
	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod() {
		assertEquals(w.work(),"I'm working already!","Mismatch between test text and method text");
	} 
   
   @Test
   @DisplayName("FH Pass Test")
   public void newtestFHWorkerPass() {
      assertEquals(w.work(),"Working...from BaseWorker\n");
   }
   
   
   
}
