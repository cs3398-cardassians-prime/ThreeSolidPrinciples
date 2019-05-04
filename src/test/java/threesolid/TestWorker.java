package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private  Worker w = new Worker();
	
	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod() {
		assertEquals(w.work(),"Working...from BaseWorker\n","Mismatch between test text and method text");
	}
	
//	@Test
//	@DisplayName("FH Pass Test")
//	public void newtestFHWorkerPass() {
//		TempWorker w2 = new TempWorker();
//		assertEquals(w2.work(),"I'm just a TempWorker temporarily working here... \n");
//	}
	
	@Test
	@DisplayName("FH Fail Test")
	public void newtestFHWorkerFail() {
		SuperWorker w2 = new SuperWorker();
		assertEquals(w2.work(),"SuperWorker can stop,will stop...\n","Mismatch between test text and method text");
	}
} 