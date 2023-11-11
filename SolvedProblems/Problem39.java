import java.util.Arrays;

public class Problem39 { // answer: 840

  public static void main(String[] args) {
    int largestCount = 0;
    int perimeter = 0;
    int[] perimeterCount = new int[1001];
    int perimeterIndex = 0;
    for(int side1 = 0; side1 < 1000; side1++) {
      for(int side2 = side1; side2 < 1000; side2++) {
        for(int side3 = side1; side3 < 1000; side3++) {
          perimeter = side1 + side2 + side3;
          if(perimeter > 1000)
            continue;
          int[] sides = {side1, side2, side3};
          if(isRightTriangle(sides))
            perimeterCount[perimeter]++;
        }
      }
    }
    for(int i = 0; i < perimeterCount.length; i++)
      if(perimeterCount[i] > largestCount) {
        largestCount = perimeterCount[i];
        perimeterIndex = i;
      }
    System.out.print(perimeterIndex);
  }

	// Precondition: int array of size 3. I covered the precondition with an exception
	// Postcondition: boolean is returned and array is sorted
	public static boolean isRightTriangle(int[] sides) throws NotTriangleException{
    if(sides.length != 3)
      throw new NotTriangleException();
		Arrays.sort(sides);
		return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
	}
}