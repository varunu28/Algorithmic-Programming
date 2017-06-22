#include <iostream>
using namespace std;
 
int main()
{
    int n,c,t;
    cin >> n;
    int a[n],b[n];
    
    for(int i = 0;i<n;i++)
    {
    	cin >> a[i];
    }
    
    for(int i = 0;i<n;i++)
    {
    	cin >> b[i];
    }
    
    for(int i=0;i<n-1;i++)
    {
    	c = 0;
    	for(int j=0;j<n-i-1;j++)
    	{
    		if(a[j]>a[j+1])
    		{
    			t = a[j];
    			a[j] = a[j+1];
    			a[j+1] = t;
    			c++;
    		}
    	}
    	if(c==0)
    	{
    		break;
    	}
    }
    
    for(int i=0;i<n-1;i++)
    {
    	c = 0;
    	for(int j=0;j<n-i-1;j++)
    	{
    		if(a[j]>a[j+1])
    		{
    			t = b[j];
    			b[j] = b[j+1];
    			b[j+1] = t;
    			c++;
    		}
    	}
    	if(c==0)
    	{
    		break;
    	}
    }
    
    int k = 1;
    for(int i = 0;i<n;i++)
    {
    	if(a[i]<=b[i])
    	{
    		k=0;
    		break;
    	}
    }
    
    if(k)
    {
    	cout << "Yes";
    }
    else
    {
    	cout << "No";
    }
    
    return 0;
}