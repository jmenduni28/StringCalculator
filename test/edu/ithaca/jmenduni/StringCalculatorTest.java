package edu.ithaca.jmenduni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by joemenduni on 1/26/18.
 */
class StringCalculatorTest {

  /**
   * Tests the function to add numbers in a string with an empty string
   */
  @Test
  void testAddEmpty() {
    StringCalculator stringCalculator = new StringCalculator();
    assertEquals(0, stringCalculator.add(null));
    assertEquals(0, stringCalculator.add(""));
  }

  /**
   * Tests the function to add numbers in a string with one number
   */
  @Test
  void testAddOneNum() {
    StringCalculator stringCalculator = new StringCalculator();
    assertEquals(0, stringCalculator.add("0"));
    assertEquals(1, stringCalculator.add("1"));
    assertEquals(5, stringCalculator.add("5"));
    assertEquals(10, stringCalculator.add("10"));
  }

}