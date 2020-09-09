import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShootingCheckTest {
  @Test
  public void checkDotTest() {
    boolean shotResult = ShootingCheck.checkDot(0, 0, 5);
    Assert.assertTrue(shotResult);
  }
}