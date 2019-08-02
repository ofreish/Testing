import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionSixTest {
  FunctionSix functionSix = null;

  @Before
  public void before() {
    functionSix = new FunctionSix();
  }

 /**
  * Test case 1
  * Purpose: Test the accuracy of FloorAbs().
  * Process: Input different numbers, compared the result to math library method.
  * floor1- decimal
  * floor2- positive integer
  * floor3- zero
  * floor4- negative integer
  */
  @Test
  public void testFloorAbs() {
    int floor1 = FunctionSix.floorAbs(1.4);
    Assert.assertEquals(floor1, Math.floor(1.4),0.0001);
    int floor2 = FunctionSix.floorAbs(2);
    Assert.assertEquals(floor2, Math.floor(2),0.0001);
    int floor3 = FunctionSix.floorAbs(0);
    Assert.assertEquals(floor3, Math.floor(0),0.0001);
    int floor4 = FunctionSix.floorAbs(-2.4);
    Assert.assertEquals(floor4, 0 - Math.floor(-2.4),0.0001);
  }


 /**
  * Test case 2
  * Purpose: Test the accuracy of testSqrtRoot().
  * Process: Input different numbers, compared the result to math library method.
  * sqrt1- positive integer
  * sqrt2- decimal
  * sqrt3- zero
  */
  @Test
  public void testSqrtRoot() {
    double sqrt1 = FunctionSix.sqrtRoot(4);
    Assert.assertEquals(sqrt1, Math.sqrt(4),0.001);
    double sqrt2 = FunctionSix.sqrtRoot(2.5);
    Assert.assertEquals(sqrt2, Math.sqrt(2.5),0.001);
    double sqrt3 = FunctionSix.sqrtRoot(0);
    Assert.assertEquals(sqrt3, Math.sqrt(0),0.001);
  }

 /**
  * Test case 3
  * Purpose: Test the accuracy of testPow().
  * Process: Input different numbers, compared the result to math library method.
  * In followed results, make positive integer, decimal, negative integer,
  * special values(0 and 1) assign to a, b, x in permutation and combination.
  * And b is bigger than zero.
  */
  @Test
  public void testPow() {
    double result1 = 1 * functionSix.pow(1, 2);
    Assert.assertEquals(result1, Math.pow(1, 2) * 1, 0.1);
    double result2 = 1 * functionSix.pow(2, 2);
    Assert.assertEquals(result2, Math.pow(2, 2) * 1, 0.1);
    double result3 = 1 * functionSix.pow(4, 0.5);
    Assert.assertEquals(result3, Math.pow(4, 0.5) * 1, 0.1);
    double result4 = 2 * functionSix.pow(2.3, 2.3);
    Assert.assertEquals(result4, Math.pow(2.3, 2.3) * 2, 0.1);
    double result5 = 2 * functionSix.pow(1, 2);
    Assert.assertEquals(result5, Math.pow(1, 2) * 2, 0.1);
    double result6 = 1 * functionSix.pow(2, 500);
    Assert.assertEquals(result6, Math.pow(2, 500) * 1, 0.1);
    double result7 = 0 * functionSix.pow(1, 2);
    Assert.assertEquals(result7, Math.pow(1, 2) * 0, 0.1);
    double result8 = 1 * functionSix.pow(0, 2);
    Assert.assertEquals(result8, Math.pow(0, 2) * 1, 0.1);
    double result9 = 1 * functionSix.pow(1, 0);
    Assert.assertEquals(result9, Math.pow(1, 0) * 1, 0.1);
    double result10 = -1 * functionSix.pow(1, 2);
    Assert.assertEquals(result10, Math.pow(1, 2) * -1, 0.1);
    double result11 = 1 * functionSix.pow(1, -2);
    Assert.assertEquals(result11, Math.pow(1, -2) * 1, 0.1);
    double result12 = 1 * functionSix.pow(2, -2.3);
    Assert.assertEquals(result12, Math.pow(2, -2.3) * 1, 0.1);
  }
}