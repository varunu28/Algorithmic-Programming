#include <iostream>
using namespace std;



int main()
{
	int n;
	cin >> n;
	int arr[n],b[n],arr_c[n];
	
	for(int i=0;i<n;i++)
	{
		cin >> arr[i];
		arr_c[i] = arr[i];
	}
	
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
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr_c[i]==arr[j])
			{
				b[i] = j+1;
				break;
			}
		}
	}
	
	for(int i = 0;i < n;i++)
    {
    	cout << b[i] << " ";
    }
    return 0;
}
