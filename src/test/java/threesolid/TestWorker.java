package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private  Worker w = new Worker();

	@DisplayName("Work Method Test")
	@Test
	public void testWorkMethod() {
		// assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text");
      assertEquals(w.work(),"Working...from BaseWorker\n");

   }
   
	@Test
	@DisplayName("Manager.setWorker Pass Test")
	public void managerSetJBWorkerPass() {
      Manager m = new Manager();
      SuperWorker sw = new SuperWorker();
      m.setWorker(sw);
      assertEquals(sw.work(),"SuperWorker cant stop,wont stop...\n");
	}
   
	// @Test
	// @DisplayName("worker & worker2 Fail Test")
	// public void Worker2JBWorkerFail() {
      // Worker w2 = new Worker();
      // assertNotEquals(w.work(),w2.work());
	// }
} 