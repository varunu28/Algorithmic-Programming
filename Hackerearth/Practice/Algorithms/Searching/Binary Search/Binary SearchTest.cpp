#include <iostream>
#include <algorithm>
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

int main()
{
    int n;
    cin >> n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
    	cin >> a[i];
    }
    sort(a,a+n);
    
    int q;
    cin >> q;
    int q1;
    
    while(q--)
    {
    	cin >> q1;
    	cout << binarySearch(a,0,sizeof(a)/sizeof(a[0]),q1) + 1 << endl;
    }
    return 0;
}
