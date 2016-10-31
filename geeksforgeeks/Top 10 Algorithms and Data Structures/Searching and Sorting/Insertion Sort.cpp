#include <iostream>
using namespace std;

// Function for Insertion Sort
void insertion_sort(int arr[], int n)
{
	int j,temp;
	for(int i = 0;i < n;i++)
	{
		j = i;
		while(j > 0 && arr[j] < arr[j-1])
		{
			temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			j--;
		}
	}
}

int main() {
	// Test Array
    int arr[] = {7,2,5,2,4,1,6,112,43,42,32121,32,1,43,2};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    insertion_sort(arr,n);
    
    // Sorted Output
    for(int i = 0;i < n;i++)
    {
    	cout << arr[i] << " ";
    }
    return 0;
}