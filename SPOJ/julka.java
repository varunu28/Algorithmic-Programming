//Julka

import java.util.Scanner;
import java.math.BigInteger;

class Main {
  public static void main(String[] args) {
    int t;
    BigInteger n,k,x,N;
    Scanner in = new Scanner(System.in);
    t = 10;
    
    while(t--!=0)
    {
	    N = in.nextBigInteger();
	    x = in.nextBigInteger();
	    n = N.subtract(x);
	    n = n.divide(BigInteger.valueOf(2));
	    k = N.subtract(n);

	    System.out.println(k);
	    System.out.println(n);
    }
    in.close();
  }
}