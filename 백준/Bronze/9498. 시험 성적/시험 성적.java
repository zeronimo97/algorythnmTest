import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int price = sc.nextInt();
    if (price <= 100 && price >= 90) {
      System.out.println("A");
    } else if (price <= 89 && price >= 80) {
      System.out.println("B");
    } else if (price <= 79 && price >= 70) {
      System.out.println("C");
    } else if (price <= 69 && price >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
    sc.close();
  }
}