package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private  Worker w = new Worker();

	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod() {
		assertEquals(w.work(), "Working...from BaseWorker\n");
	}
	
	@Test
	@DisplayName("TempWorker sick Pass Test")
	public void newtestIVTWorkerPass() {
        TempWorker t = new TempWorker();
        assertTrue(t.sick() == "I can't afford get to get sick since I'm a TempWorker... \n", "Condition is not true.");
    }

	@Test
	@DisplayName("Worker Fail Test")
	public void newtestIVTWorkerFail() {
        SuperWorker s = new SuperWorker();
        assertNull(s);
	}

} 
