package edu.ithaca.jmenduni;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joemenduni on 1/26/18.
 
 */
public class StringCalculator {

  /**
   * Adds numbers in a string
   * @param numbers - list of numbers, up to 2, which should be separated by commas, newlines, or a specified custom delimiter
   * @return sum of numbers in the input list, or 0 if the list is empty
   */
  public int add(String numbers) throws IllegalArgumentException {
    // if the string is empty, return 0
    if (numbers == null || numbers.isEmpty()) {
      return 0;
    }

    // gets custom decimeter and replaces it with commas
      
    // look up built in functions for string iterator
    if (numbers.startsWith("//")) {
      String delimeter = numbers.substring(2).split("\n")[0];
      numbers = numbers.replace("//" + delimeter + "\n", "");
      numbers = numbers.replaceAll(delimeter, ",");
    }

    // if there is more than 1 number
      if (numbers.contains(",") || numbers.contains("\n")) {
      numbers = numbers.replaceAll("\n", ",");
      // splits numbers into list
      String[] strArray = numbers.split(",");
      int sum = 0;
      // keeps track of whether a negative number was found
      boolean hasNegative = false;
      // holds negative numbers to return in exception
      List<Integer> negativeList = new ArrayList<>();
      for (String str: strArray) {
        int num = Integer.parseInt(str);
        if (num < 0) {
          hasNegative = true;
          negativeList.add(num);
        }
        sum += num;
      }
      if (hasNegative) {
        throw new IllegalArgumentException("negatives not allowed: " + negativeList.toString());
      }
      return sum;
    }
    // if there is just one number in the string
    else {
      int val = Integer.parseInt(numbers);
      if (val < 0) {
        throw new IllegalArgumentException("negatives not allowed: " + val);
      }
      return val;
    }
  }
}
