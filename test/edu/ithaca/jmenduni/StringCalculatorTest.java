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
  void testAddOneNum()  {
    StringCalculator stringCalculator = new StringCalculator();
    assertEquals(0, stringCalculator.add("0"));
    assertEquals(1, stringCalculator.add("1"));
    assertEquals(5, stringCalculator.add("5"));
    assertEquals(10, stringCalculator.add("10"));
    assertEquals(1000, stringCalculator.add("1000"));
    assertEquals(-1, stringCalculator.add("-1"));
    assertEquals(-10, stringCalculator.add("-10"));
  }

  /**
   * Tests the function to add numbers in a string with two numbers
   */
  @Test
  void testAddTwoNums() {
    StringCalculator stringCalculator = new StringCalculator();
    assertEquals(0, stringCalculator.add("0,0"));
    assertEquals(1, stringCalculator.add("1,0"));
    assertEquals(2, stringCalculator.add("1,1"));
    assertEquals(15, stringCalculator.add("5,10"));
    assertEquals(15, stringCalculator.add("10,5"));
    assertEquals(-5, stringCalculator.add("-7,2"));
    assertEquals(-10, stringCalculator.add("-5,-5"));

  }

  /**
   * Tests the function to add numbers in a string with an unknown amount of numbers
   */
  @Test
  void testAddUnknownNums() {
    StringCalculator stringCalculator = new StringCalculator();
    assertEquals(6, stringCalculator.add("1,2,3"));
    assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    assertEquals(29, stringCalculator.add("1,2,3,4,5,6,8"));
    assertEquals(45, stringCalculator.add("1,2,3,4,5,6,8,9,7"));
    assertEquals(-10, stringCalculator.add("-2,-3,-5"));
    assertEquals(-7, stringCalculator.add("-1,-2,-3,4,-5"));
  }


}