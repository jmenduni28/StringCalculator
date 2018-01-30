package edu.ithaca.jmenduni;

/**
 * Created by joemenduni on 1/26/18.
 */
public class StringCalculator {

  /**
   * Adds numbers in a string
   * @param numbers - list of numbers, up to 2, which should be separated by commas
   * @return sum of numbers in the input list, or 0 if the list is empty
   */
  public int add(String numbers) {
    if (numbers == null || numbers.isEmpty()) {
      return 0;
    }
    else {
      return Integer.parseInt(numbers);
    }
  }
}
