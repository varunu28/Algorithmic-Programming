#include <iostream>
using namespace std;

// Selection Sort Function
void selection_sort(int arr[],int n)
{
	int min, temp;
	for(int i = 0;i < n; i++)
	{
		min = i;
		for(int j = i; j < n; j++)
		{
			if(arr[j] < arr[min])
			{
				min = j;
			}
		}
		temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
	}
}

int main() {
    int arr[] = {7,5,2,4,1,6,112,43,42,32121,32,1,43,2}; //Test Array
    int n = sizeof(arr)/sizeof(arr[0]);
    selection_sort(arr,n);
    
    // Sorted Output
    for(int i = 0;i < n;i++)
    {
    	cout << arr[i] << " ";
    }
    return 0;
}