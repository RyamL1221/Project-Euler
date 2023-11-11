import java.util.*;
import java.util.regex.*;


class Problem26B {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("(?>((\\d+?)(\\2{5})))");
    String l = (1.0/7) + ""; 
    Matcher m = p.matcher(l);
    if(m.find()){
      System.out.println(m.group(2));
    } // can we have it print out only one iteration? 
    //Sure. Took me a hour to make sure the regex will not make the CPU crash. Bruh. This should give you the string of the matched pattern. You all can do the rest.  - Jacob
  } 
  
}