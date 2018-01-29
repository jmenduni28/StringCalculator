package edu.ithaca.jmenduni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by joemenduni on 1/26/18.
 */
class StringCalculatorTest {

  /**
   * Tests the function to add numbers in a string
   */
  @Test
  void addTest() {
    assertEquals(StringCalculator.add(null), 0);
    assertEquals(StringCalculator.add(""), 0);
  }

}