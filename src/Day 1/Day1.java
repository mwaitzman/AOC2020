import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Day1 {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    System.out.println("Starting program...");
    File inputFile = new File("input.txt");
    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    int lines = -1;
    while (reader.readLine() != null) lines++;
    reader.close();
    int[] numbers = new int[lines];
    Scanner sc2 = new Scanner(inputFile);
    System.out.println("sc2 created");
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(sc2.nextLine());
    }
    boolean foundSolution = false;
    int num1 = 0;
    int num2 = 0;
    int sum = 0;
    for (int i = 0; i <= numbers.length; i++) {
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
    sc2.close();
//    inputFile.close();
    System.out.printf("PART 1: %n sum: %d%n num1: %d%n num2: %d%n ------------", sum, num1, num2);
    doPart2();
    System.out.print("End of program");
  }
  public static void doPart2() {

  }
}
