import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int king = scan.nextInt();
        int queen = scan.nextInt();
        int look = scan.nextInt();
        int bishop = scan.nextInt();
        int knight = scan.nextInt();
        int pawn = scan.nextInt();
        scan.close();
      System.out.print(1 - king + " ");
      System.out.print(1 - queen + " ");
      System.out.print(2 - look + " ");
      System.out.print(2 - bishop + " ");
      System.out.print(2 - knight + " ");
      System.out.print(8 - pawn + " ");
    }
}