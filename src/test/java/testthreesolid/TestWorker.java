
package testthreesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
 private Worker w = new Worker();
 @Test
 @DisplayName("Work Method Test")
 public void newtestBCWorkerPass()
 {
 assertEquals(w.work(),"Working...from BaseWorker\n");
 }
 @Test
 @DisplayName("Sick Method Test")
 public void newtestBCWorkerFail()
 {
  assertEquals(w.sick(),"Worker is not sick...:-) \n");
 }
 
}
