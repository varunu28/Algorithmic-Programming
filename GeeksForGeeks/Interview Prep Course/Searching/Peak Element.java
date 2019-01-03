class GfG {
	public int peakElement(int[] arr,int n) {
	    for (int i=0; i<n; i++) {
	        boolean flag1 = true;
	        boolean flag2 = true;
	        
	        if (i - 1 >= 0) {
	            flag1 = !(arr[i] < arr[i-1]);
	        }
	        
	        if (i + 1 < n) {
	            flag2 = !(arr[i] < arr[i+1]); 
	        }
	        
	        if (flag1 && flag2) {
	            return i;
	        }
	    }
	    
	    return 0;
	}
}
