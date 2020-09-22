import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShootingCheckTest {
  /*
  double radiuses[] = {0, 1, 10};
  double xCoordinates[] = {0, -1, 1};
  double yCoordinates[] = {0, -1, 1};
  */

  @Test
  public void checkDotZeroRadiusTest() {
    boolean shotResult = true;
    boolean shotResult2 = true;
    shotResult = ShootingCheck.checkDot(1, 1, 0);
    Assert.assertFalse(shotResult);
    shotResult = ShootingCheck.checkDot(-1, 1, 0);
    Assert.assertFalse(shotResult);
    shotResult = ShootingCheck.checkDot(1, -1, 0);
    Assert.assertFalse(shotResult);
    shotResult = ShootingCheck.checkDot(-1, -1, 0);
    Assert.assertFalse(shotResult);
    shotResult2 = ShootingCheck.checkDot(0, 1, 2);
    Assert.assertTrue(shotResult2);
    shotResult2 = ShootingCheck.checkDot(0, 0, 2);
    Assert.assertTrue(shotResult2);
    shotResult2 = ShootingCheck.checkDot(2, 0, 2);
    Assert.assertTrue(shotResult2);
    shotResult2 = ShootingCheck.checkDot(0, -1, 2);
    Assert.assertTrue(shotResult2);
    shotResult2 = ShootingCheck.checkDot(0, -2, 2);
    Assert.assertTrue(shotResult2);
    shotResult2 = ShootingCheck.checkDot(-2, 0, 2);
    Assert.assertTrue(shotResult2);
    shotResult2 = ShootingCheck.checkDot(-2, 1, 2);
    Assert.assertTrue(shotResult2);
    /*
    for (int i = 0; i < xCoordinates.length; i++) {
      shotResult = ShootingCheck.checkDot(xCoordinates[i], yCoordinates[i], radiuses[0]);
      Assert.assertTrue(shotResult);
    }
    */
  }
}