import java.time.LocalDate;

class Problem19 {
  
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(1901, 1, 1);
    int count = 0;
    for(int year = 1901; year <= 2000; year++)
      for(int month = 1; month <= 12; month++)
        for(int day = 1; day <= date.lengthOfMonth(); day++) {
          date = LocalDate.of(year, month, day);
          String dayOfWeek = date.getDayOfWeek() + "";
          if(dayOfWeek.equals("SUNDAY") && day == 1)
            count++;
        }
    System.out.println(count);
  } //tag team by byan and jacob sze :D. answer is 171
  
}