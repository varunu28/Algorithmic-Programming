import java.util.Arrays;

/*
 * Find just next greater element in array for each element. 
 * Put -1 if next greater does not exist
 */
public class Main {
	
	public static void main(String[] args) {
	
		int[] arr = {6, 3, 9, 8, 10, 2, 1, 15, 7};
		int[] ans = findNextGreater(arr);
		
		for (int num : ans) {
			System.out.print(num + " ");
		}
	}
	
	public static int[] findNextGreater(int[] arr) {
		int[] ans = new int[arr.length];
		int[] copy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copy);
		
		for (int i=0; i<arr.length; i++) {
			int idx = findIndex(copy, arr[i]);
			if (idx != arr.length-1) {
				ans[i] = copy[idx+1];
			}
			else {
				ans[i] = -1;
			}
		}
		
		return ans;
	}
	
	public static int findIndex(int[] arr, int num) {
		
		int start = 0;
		int end = arr.length-1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			if (arr[mid] == num) {
				return mid;
			}
			else if(arr[mid] < num) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
 		
		return -1;
	}
}
