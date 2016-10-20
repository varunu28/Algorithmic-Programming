#include <iostream>
using namespace std;
 
int main()
{
	long long int n,x,max_val,skip,count;
    cin >> n >> x;
    long long int a[n];
    for(long long int i=0;i<n;i++)
    {
    	cin >> a[i];
    }
    skip = 1;
    max_val = 0;
    count = 0;
    for(long long int i=0;i<n;i++)
    {
    	if(a[i] > x)
    		{
    			skip--;
    		}
    		else
    		{
    			count++;
    		}
    		if(skip==-1)
    		{
    			break;
    		}
    	}
    max_val = max(count,max_val);
    cout << max_val;
    return 0;
}