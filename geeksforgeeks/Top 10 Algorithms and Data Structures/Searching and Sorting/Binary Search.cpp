#include <iostream>
using namespace std;

int binarySearch(int a[],int start, int end, int num)
{
    if(end >= start)
    {
        int mid = start + (end - start)/2;
        
        if(a[mid] == num)
        {
            return mid;
        }
        else if(a[mid] < num)
        {
            return binarySearch(a, mid+1, end, num);
        }
        else
        {
            return binarySearch(a, start, mid-1, num);
        }
    }
    else
    {
        return -1;
    }
}

int main() {
	int a[] = {1,3,23,34,56,76,87,98,102};
	int num = 76;
	int l = sizeof(a)/sizeof(a[0]);
	
	if(binarySearch(a, 0, l-1, num) == -1)
	{
	    cout << num << " is not present in array.\n";
	}
	else
	{
	    cout << num << " is present at index: " << binarySearch(a, 0, l-1, num);
	}
	return 0;
}