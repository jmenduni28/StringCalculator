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

    // gets custom decimeter and replaces it with commas
    if (numbers.startsWith("//")) {
      String delimeter = numbers.substring(2).split("\n")[0];
      numbers = numbers.replace("//" + delimeter + "\n", "");
      numbers = numbers.replaceAll(delimeter, ",");
    }

    if (numbers.contains(",") || numbers.contains("\n")) {
      numbers = numbers.replaceAll("\n", ",");
      String[] strArray = numbers.split(",");
      int sum = 0;
      for (String str: strArray) {
        sum += Integer.parseInt(str);
      }
      return sum;
    }
    else {
      return Integer.parseInt(numbers);
    }
  }
}
