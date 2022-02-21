import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TestSumArrayList {

  /*
   * Credit to user scaevity on Stack Overflow for helping me figure out how to add multiple values
   * to an ArrayList at once without needing to loop
   */

  // First test case (Positive numbers close to zero)

  @Test
  public void testCalcSum1() {
    ArrayList<Double> testList = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
    double expectedSum = 15.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }

  // Second test case (Negative numbers close to zero)

  @Test
  public void testCalcSum2() {
    ArrayList<Double> testList = new ArrayList<>(Arrays.asList(-1.0, -2.0, -3.0, -4.0, -5.0));
    double expectedSum = -15.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }

  // Third test case (Positive and negative numbers close to zero)

  @Test
  public void testCalcSum3() {
    ArrayList<Double> testList = new ArrayList<>(Arrays.asList(-1.0, 2.0, -3.0, 4.0, -5.0));
    double expectedSum = -3.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }

  // Fourth test case (Large positive numbers)

  @Test
  public void testCalcSum4() {
    ArrayList<Double> testList =
        new ArrayList<>(Arrays.asList(5500000.0, 250000.0, 150000.0, 750000.0, 500000.0));
    double expectedSum = 7150000.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }

  // Fifth test case (Small negative numbers)

  @Test
  public void testCalcSum5() {
    ArrayList<Double> testList =
        new ArrayList<>(Arrays.asList(-5500000.0, -250000.0, -150000.0, -750000.0, -500000.0));
    double expectedSum = -7150000.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }

  // Sixth test case (Large positive numbers and small negative numbers)

  @Test
  public void testCalcSum6() {
    ArrayList<Double> testList =
        new ArrayList<>(Arrays.asList(5500000.0, -250000.0, 150000.0, -750000.0, 500000.0));
    double expectedSum = 5150000.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }

  // Seventh test case (All values are zero)

  @Test
  public void testCalcSum7() {
    ArrayList<Double> testList = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0));
    double expectedSum = 0.0;
    double actualSum = SumArrayList.calcSum(testList);

    Assert.assertEquals(expectedSum, actualSum, 0.001);
  }
}

