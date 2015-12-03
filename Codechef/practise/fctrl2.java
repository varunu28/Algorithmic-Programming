import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class competitive_programming {
    protected static ArrayList<BigInteger> table = new ArrayList<BigInteger>();

    static {
        table.add(BigInteger.valueOf(1));
    }

    public static synchronized BigInteger factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x must be non-negative.");
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastfact = table.get(size - 1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return table.get(x);
    }

    public static void main(String[] args) throws Exception {
        
    	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
    	int t=Integer.parseInt(br.readLine());
    	
    	while(t>0)
    	{
    		int n =Integer.parseInt(br.readLine());
    		System.out.println(factorial(n));
    		t--;
    	}
    }
}