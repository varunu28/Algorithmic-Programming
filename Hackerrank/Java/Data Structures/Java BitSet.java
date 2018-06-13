import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().trim().split("\\s+");
        
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        while(m-- > 0) {
            strs = br.readLine().trim().split("\\s+");
            
            if ("AND".equals(strs[0])) {
                if ("1".equals(strs[1])) {
                	b1.and(b2);
                } 
                else {
                	b2.and(b1);
                }
            }
            else if ("OR".equals(strs[0])) {
            	if ("1".equals(strs[1])) {
                	b1.or(b2);
                } 
                else {
                	b2.or(b1);
                }
            }
            else if ("XOR".equals(strs[0])) {
            	if ("1".equals(strs[1])) {
                	b1.xor(b2);
                } 
                else {
                	b2.xor(b1);
                }
            }
            else if ("SET".equals(strs[0])) {
            	if ("1".equals(strs[1])) {
                	b1.set(Integer.parseInt(strs[2]));
                }
            	else {
            		b2.set(Integer.parseInt(strs[2]));
            	}
            }
            else {
            	if ("1".equals(strs[1])) {
                	b1.flip(Integer.parseInt(strs[2]));
                } 
            	else {
            		b2.flip(Integer.parseInt(strs[2]));
            	}
            }
            
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
    
}
