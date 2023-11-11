import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException; 

// Answer: 7273
class Problem67 {
	public static void main(String[] args) throws IOException { 
		File file1 = new File("p067_triangle.txt");
		FileReader fileRead = new FileReader(file1);
  	BufferedReader textFile = new BufferedReader(fileRead);
    String numString = "";
    int pos = 0;
    int[][] triangle = new int[100][100];
    
		try {
			for(int i = 0; i <= 99; i++) {
        pos = 0;
        numString = textFile.readLine();
        for(int j = 0; j <= i; j++) {
          triangle[i][j] = toInt(numString.substring(pos, pos + 2));
          pos += 3;
        }
      } 
    }
    catch(IOException e) {
    	System.out.print("File not found");
    }
        
		for (int row = 99; row >= 0; row--) {
			for (int index = 0; index <= row - 1; index++) {
				if (triangle[row][index] >= triangle[row][index + 1])
					triangle[row - 1][index] += triangle[row][index];
				else
					triangle[row - 1][index] += triangle[row][index + 1];
			}
		}

		System.out.println(triangle[0][0]);
	} // BIGGEST COLLAB EVER IN EXISTENCE BY BRANDON, BYAN, and THE FAMED MS. REHWINKEL

	public static int toInt(String a) {
		switch (a) {
			case "00":
				return (0);
			case "01":
				return (1);
			case "02":
				return (2);
			case "03":
				return (3);
			case "04":
				return (4);
			case "05":
				return (5);
			case "06":
				return (6);
			case "07":
				return (7);
			case "08":
				return (8);
			case "09":
				return (9);
			default:
				return (Integer.parseInt(a));
		}
	}
}