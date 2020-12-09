import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Day9 {

  public static void main(String[] args) throws IOException {
    doPart2(doPart1());
  }
  public static int doPart1() throws IOException, FileNotFoundException {
    BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
    List<String> lines = new LinkedList<String>(); // create a new list
    String line = in.readLine(); // read a line at a time
    while(line != null) { // loop till you have no more lines
      lines.add(line); // add the line to your list
      line = in.readLine(); // try to read another line
      }
      assert lines.size() >= 25;
      for(int i = 25; i < lines.size(); i++) {
        if (!isValid(Integer.parseInt(lines.get(i)), lines.subList(i-25, i).stream().mapToInt(Integer::parseInt).toArray())) {
          System.out.printf("%d@%d", Integer.parseInt(lines.get(i)),i);
          return Integer.parseInt(lines.get(i));
        }
      }
    System.out.println("number not found");
  }

  public static boolean isValid(int val, int[] prev25) {
    int v1 = 0, v2 = 0;
    for (int i = 0; i < 25; i++) {
      for (int j = 0; j < 25; j++) {
        v1 = prev25[i];
        v2 = prev25[j];
        if (v1+v2 == val) return true;
      }
    }
    System.out.printf("%d + %d\n", v1, v2);
    return false;
  }

  static void doPart2(int sum) {

  }
}
