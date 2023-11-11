class Problem9 {
  
  public static void main(String[] args) {
    int product = 0;
    for(int i = 1; i <= 1000; i++) {
      
      for(int j = 1; j <= 1000; j++) {
        
        for(int k = 1; k <= 1000; k++) {
          
          if(isTriplet(i, j, k))               
            if(i + j + k == 1000)
              product = i * j * k;
          
        }
        
      }
      
    }
    
    System.out.println(product);
    
  }

  public static boolean isTriplet(int a, int b, int c) {

    if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(a, 2) + Math.pow (c, 2) == Math.pow(b, 2))
      return(true);
    return(false);
    
  }
} //BYAN
// THE ONE PIECE IS REAL!!!!