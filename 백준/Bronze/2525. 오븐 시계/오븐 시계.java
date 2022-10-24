import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 0 <= h <= 23, 0<= M <= 59
    // 시간 분
    int hh = sc.nextInt();
    int mm = sc.nextInt();

    int sum = sc.nextInt();

    int M = 60 *  hh + mm ;
    M += sum;

    int realH = (M / 60) % 24;
    
    int realM = M % 60;

    System.out.print(realH + " " + realM);
  }
}