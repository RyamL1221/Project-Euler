import java.util.ArrayList;

public class Problem45 { //answer: 1533776805

  public static void main(String[] args) {
    ArrayList<Long> pentagonNum = new ArrayList<Long>();
    ArrayList<Long> triangleNum = new ArrayList<Long>();
    ArrayList<Long> hexagonNum = new ArrayList<Long>();
    for(long i = 1L; i < 100000L; i++) {
      pentagonNum.add(calcPentagonNum(i));
      hexagonNum.add(calcHexagonalNum(i));
      triangleNum.add(calcTriangleNum(i));
    }
    for(long triangle: triangleNum)
      if(hexagonNum.contains(triangle) && pentagonNum.contains(triangle) && triangle > 40755) {
        System.out.println(triangle);
        break;
      }
  }

  public static long calcPentagonNum(long n) { 
    return (long) (n * (((3 * n) - 1) / 2.0));
  }

  public static long calcTriangleNum(long n) {
    return (long) ((n * (n + 1)) / 2.0);
  }

  public static long calcHexagonalNum(long n) {
    return (long) (n * ((2 * n) - 1));
  }
}