class GfG {
	int bin_search(int A[], int left, int right,  int k) {
	    if (left > right) {
	        return -1;
	    }
	    
	    int mid = (left + right) / 2;
	    if (A[mid] == k) {
	        return mid;
	    }
	    else if (A[mid] > k) {
	        return bin_search(A, left, mid-1, k);
	    }
	    else {
	        return bin_search(A, mid + 1, right, k);
	    }
	}
}
