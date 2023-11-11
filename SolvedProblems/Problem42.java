import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList;

 public class Problem42 { // answer: 162

  public static void main(String[] args) throws IOException, FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("p042_words.txt")));
    String allWords = reader.readLine();
    ArrayList<String> words = new ArrayList<>();
    int index = 0;
    while(allWords.indexOf("\"") != -1) {
      index = allWords.indexOf("\"");
      allWords = allWords.substring(index + 1);
      words.add(allWords.substring(0, allWords.indexOf("\"")));
      allWords = allWords.substring(allWords.indexOf("\"") + 1);
    }
    ArrayList<Integer> triangleNumbers = new ArrayList<Integer>();
    for(int i = 1; i <= 1000; i++)
      triangleNumbers.add(calcTriangleNumber(i));
    int count = 0;
    int tempSum = 0;
    for(int i = 0; i < words.size(); i++) {
      for(int j = 0; j < words.get(i).length(); j++) 
        tempSum += (int) (words.get(i).charAt(j)) - 64; 
      if(triangleNumbers.contains(tempSum))
        count++;
      tempSum = 0;
    }
     System.out.println(count);
  }

   public static int calcTriangleNumber(double n) {
     return (int) ((1.0/2.0) * n * (n + 1.0));
   }

}
