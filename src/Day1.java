import java.util.Scanner;
import java.io.File;
public class Day1 {
  public static void main(String[] args) {
    File inputFile = new File("input.txt");
    Scanner sc = new Scanner(inputFile);
    int length = -1;
    while(sc.hasNextLine()) {
      length++;
    }
    int[] numbers = new int[length];
    sc = new Scanner(inputFile);
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    boolean foundSolution = false;
    int num1, num2, sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (foundSolution) break;
      num1 = numbers[i];
      for (int j = 0; j < numbers.length; j++) {
        if (foundSolution) break;
        num2 = numbers[j];
        if (num1 + num2 == 2020) {
          sum = num1*num2;
          foundSolution = true;
        }
      }
    }
    sc.close();
//    inputFile.close();
    System.out.printf("sum: %d%n num1: %d%n num2: %d%n", sum, num1, num2);
  }
}
