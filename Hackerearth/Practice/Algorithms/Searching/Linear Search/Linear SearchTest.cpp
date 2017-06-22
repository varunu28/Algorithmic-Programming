#include <iostream>
using namespace std;

int linearSearch(int a[],int m,int k)
{
	for(int i=k-1;i>=0;i--)
	{
		if(a[i] == m)
		{
			return i+1;
		}
	}
	return -1;
}

int main()
{
    int n,m;
    cin >> n >> m;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
    	cin >> a[i];
    }
    
    cout << linearSearch(a,m,sizeof(a)/sizeof(a[0]));
    return 0;
}
