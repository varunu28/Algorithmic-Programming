#include<iostream>
using namespace std;

int linear_search(int arr[],int num, int len)
{

	for(int i=0;i<len;i++)
	{
		if(arr[i] == num)
		{
			return i;
		}
	}
	return -1;
}

int main()
{
	int arr[] = {1,2,32,5443,122,432,5,322};
	int num = 122;
	int len = sizeof(arr)/sizeof(arr[0]);

	cout << num << " is at index: " << linear_search(arr, num, len);
	return 0;
}