import java.util.Scanner;
 
class Solution1 {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int PROD = n*m;
    System.out.println("PROD = "+Integer.valueOf(PROD));
  }
}