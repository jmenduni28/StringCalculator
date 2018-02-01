package edu.ithaca.jmenduni;

/**
 * Created by joemenduni on 1/26/18.
 
 */
public class StringCalculator {

  /**
   * Adds numbers in a string
   * @param numbers - list of numbers, up to 2, which should be separated by commas or newlines
   * @return sum of numbers in the input list, or 0 if the list is empty
   */
  public int add(String numbers) {
    // if the string is empty, return 0
    if (numbers == null || numbers.isEmpty()) {
      return 0;
    }

    // if there is more than 1 number
    if (numbers.contains(",") || numbers.contains("\n")) {
      numbers = numbers.replaceAll("\n", ",");
      // splits numbers into list
      String[] strArray = numbers.split(",");
      int sum = 0;
      for (String str: strArray) {
        int num = Integer.parseInt(str);
        sum += num;
      }
      return sum;
    }
    // if there is just one number in the string
    else {
      int val = Integer.parseInt(numbers);
      return val;
    }
  }
}
