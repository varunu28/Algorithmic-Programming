class GfG {
    long floorSqrt(long x) {
        return floorSqrtHelper(x, 0, x);
	}
	
	long floorSqrtHelper(long x, long start, long end) {
	    long ans = 0;
	    
	    while (start <= end) {
	        long mid = (end + start) / 2;
	        long sq = (long) Math.pow(mid, 2);
	        if (sq == x) {
	            ans = mid;
	            break;
	        }
	        else if (sq < x) {
	            ans = mid;
	            start = mid + 1;
	        }
	        else {
	            end = mid - 1;
	        }
	    }
	    
	    return ans;
	}
}
