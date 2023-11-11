class Problem17 { 

  public static void main(String[] args) {
    int numLetter = 0;
    String numString = "";
    String[] one = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] special = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}; 
    String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    for(int i = 1; i <= 1000; i++) {
      switch(numDigits(i)) {
        case 4:
          numString = "onethousand";          
          break;
        case 3:         
          numString = one[i / 100] + "hundred";
          if(i / 10 % 10 == 0 && i % 10 == 0) // hundreds
            break;
          else if(i / 10 % 10 == 0 && i % 10 > 0 && i % 10 <= 9) { // covers from #01 - #09
            numString += "and" + one[i % 10];
            break;
          }
          else if(i / 10 % 10 == 1 && i % 10 >= 1 && i % 10 <= 9) { // covers #11 - #19
            numString += "and" + special[i % 10];
            break;
          }
          else if(i / 10 % 10 >= 2 && i % 10 <= 9 && i % 10 >= 1) { // covers #21 - #99 not including ##0
            numString += "and" + tens[i / 10 % 10] + one[i % 10];
            break;
          } else if(i / 10 % 10 >= 1 && i % 10 == 0) { // covers ##0, the tens places
            numString += "and" + tens[i / 10 % 10];
            break;
          }
        case 2:           
          if(i / 10 >= 1 && i % 10 == 0) { //covers tens
            numString = tens[i / 10]; 
            break;
          } 
          else if(i / 10 == 1 && i % 10 > 0 && i % 10 <= 9) { // covers 11 - 19
            numString = special[i % 10];
            break;
          }
          else if(i / 10 >= 2 && i / 10 <= 9 && i % 10 > 0 && i % 10 <= 9) { // covers 21-99 not including tens
            numString = tens[i / 10] + one[i % 10];
            break; 
          } 
        case 1:
          numString = one[i]; //covers all single digits
          break; 
      }

      numLetter += numString.length();
    }
    
    System.out.println(numLetter);
  } //solved by byan. answer: 21124

  public static int numDigits(int n) {

    int count = 0;
    while(n > 0) {
      count++;
      n /= 10;      
    }
    return(count);
  }
  
}