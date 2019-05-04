
package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
 private Worker w = new Worker();
 @Test
 @DisplayName("Passing Test")
 public void newtestBCWorkerPass()
 {

   assertTrue(true, w.work());
 }
 
 @Test
 @DisplayName("Failing Test")
 public void newtestBCWorkerFail()
 {

   assertNull(w);
 }
 
}
