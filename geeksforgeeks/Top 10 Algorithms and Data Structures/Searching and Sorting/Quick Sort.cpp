#include <iostream>
using namespace std;

int partition(int a[], int start, int end)
{
    int i = start + 1;
    int piv = a[start];
    for(int j=start + 1;j <= end; j++)
    {
        if(a[j] < piv)
        {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
        }
    }
    int temp = a[start];
    a[start] = a[i-1];
    a[i-1] = temp;
    return i-1;
}

void quick_sort(int a[], int start, int end)
{
    if(start < end)
    {
        int piv_pos = partition(a, start, end);
        quick_sort(a, start, piv_pos-1);
        quick_sort(a, piv_pos+1, end);
    }
}

int main() {
	int a[] = {56,1,3,23,6,34,76,97,87,31,98};
	quick_sort(a,0,sizeof(a)/sizeof(a[0])-1);
	
	for(int i = 0;i<sizeof(a)/sizeof(a[0]); i++)
	{
	    cout << a[i] << endl;
	}
	return 0;
}