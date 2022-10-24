import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 0 <= h <= 23, 0<= M <= 59
    // 시간 분
    int hh = sc.nextInt();
    int mm = sc.nextInt();
    if (mm < 45) {
      hh--;
      mm = 60 - (45-mm);
      if (hh < 0) {
        hh = 23;
      }
      System.out.println(hh + " " + mm);
    } else {
      mm= mm - 45;
      System.out.println(hh + " " + mm);
    }

  }
}