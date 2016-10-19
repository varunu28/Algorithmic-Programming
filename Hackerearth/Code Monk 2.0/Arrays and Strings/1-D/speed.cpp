#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
    	int n;
    	cin >> n;
    	unsigned long long a[n];
    	for(int i=0;i<n;i++)
    	{
    		cin >> a[i];
    	}
    	int ans = 1;
    	
    	int i=1;
    	while(i <= n-1)
    	{
    		if(a[i] < a[i-1])
    		{
    			ans++;
    		}
    		else
    		{
    			a[i]=a[i-1];
    		}
    		i++;
    	}
    	cout << ans << endl;
    }
    return 0;
}
