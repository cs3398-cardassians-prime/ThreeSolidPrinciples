package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private  Worker w = new Worker();

	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod() {
		assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text");
	}
   
	@Test
	@DisplayName("Work Method Test")
	public void newtestJBWorkerPass() {
      w = new Manager();
      Worker robot = new Robot();
      w.setWorker(robot);
      assertEquals(w.manager(), "Robot rebooting... \n");
		assertEquals(w.work(),"I'm working already!");
	}
   
	// @Test
	// @DisplayName("Work Method Test")
	// public void newtest<your_initials>WorkerFail() {
		// assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text");
	// }
} 