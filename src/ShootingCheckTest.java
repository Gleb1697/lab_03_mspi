import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShootingCheckTest {
  @Test
  public void checkDotTest() {
    boolean shotResult = ShootingCheck.checkDot(0, 0, 5);
    assertEquals(true, shotResult);
  }
}