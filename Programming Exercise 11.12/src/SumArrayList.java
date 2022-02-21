/*
 * This is a program that reads 5 values from the user and then calculates the sum of the values
 * using an ArrayList
 */

import java.util.Scanner;
import java.util.ArrayList;

public class SumArrayList {

  // Reads the values that the user inputs and adds them to the ArrayList
  public static void readArrList(ArrayList<Double> list) {
    System.out.println("Enter 5 numbers: ");
    Scanner scanner = new Scanner(System.in);
    double userNum;
    for (int i = 0; i < 5; i++) {
      userNum = scanner.nextDouble();
      list.add(userNum);
    }
    scanner.close();
  }

  // Calculates the sum of every value in the ArrayList
  public static double calcSum(ArrayList<Double> list) {
    double sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += list.get(i);
    }
    return sum;
  }

  // This is the main method
  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<Double>();
    readArrList(list);
    // Print the sum of the values in the ArrayList
    System.out.println("The sum of all your numbers is: " + calcSum(list));
  }
}
