#include <iostream>
 
using namespace std;
 
int main()
{
	ios_base::sync_with_stdio(0); 
    unsigned long long n,q,l,r;
    unsigned long long start,end;
    unsigned long long num;
    int zeroORone;
    
    cin >> n >> q;
    unsigned long long a[n];
    
    for(int i=0; i<n; i++)
    {
    	cin >> a[i];
    }
    
    while(q--)
    {
    	
    	cin >> zeroORone;
    	
    	if(zeroORone == 0)
    	{
    		
    		cin >> start >> end;
    		if(a[end-1] == 1)
    		{
    			cout << "ODD" << endl;
    		}
    		else
    		{
    			cout << "EVEN" << endl;
    		}
    	}
    	else
    	{
    		
    		cin >> num;
    		if(a[num-1]==0)
    		{
    			a[num-1] = 1;
    		}
    		else
    		{
    			a[num-1] = 0;
    		}
    	}
    }
    return 0;
}