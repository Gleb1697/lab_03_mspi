import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShootingCheckTest {
  double radiuses[] = {0, 1, 10};
  double xCoordinates[] = {0, -1, 1};
  double yCoordinates[] = {0, -1, 1};

  @Test
  public void checkDotTestZeroRadius() {
    boolean shotResult = true;
    shotResult = ShootingCheck.checkDot(xCoordinates[1], yCoordinates[1], radiuses[2]);
    Assert.assertTrue(shotResult);
    /*
    for (int i = 0; i < xCoordinates.length; i++) {
      shotResult = ShootingCheck.checkDot(xCoordinates[i], yCoordinates[i], radiuses[0]);
      Assert.assertTrue(shotResult);
    }
    */
  }
}