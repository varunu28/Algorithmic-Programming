//Chandu and Consecutive Letters

import java.util.Scanner;
class Solution1 {
    public static void main(String args[] ) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(N > 0){
			String s = sc.next();
			sb.append(s.charAt(0));
			int index = 1;
			for(int i = 1; i < s.length(); i++){
				if(s.charAt(i) != sb.charAt(index-1)){
					sb.append(s.charAt(i));
					index++;
				}
			}
			N--;
			System.out.println(sb.toString());
			sb.delete(0,sb.length());
		}
        
    }
}
