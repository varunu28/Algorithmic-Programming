#include <iostream>
using namespace std;

int main()
{
    int n,t,swap,temp;
    string t_str;
    cin >> n >> t;
    string name[n];
    int quot[n];
    
    for(int i=0;i<n;i++)
    {
    	cin >> name[i];
    	cin >> quot[i];
    }
    
    for(int i=0;i<n-1;i++)
    {
    	swap = 0;
    	for(int j=0;j<n-i-1;j++)
    	{
    		if(quot[j]>quot[j+1])
    		{
    			temp = quot[j];
    			quot[j] = quot[j+1];
    			quot[j+1] = temp;
    			t_str = name[j];
    			name[j] = name[j+1];
    			name[j+1] = t_str;
    			swap++;
    		}
    		if(quot[j] == quot[j+1])
    		{
    			if(name[j].compare(name[j+1]) < 0)
    			{
    				t_str = name[j];
        			name[j] = name[j+1];
        			name[j+1] = t_str;
    			swap++;
    				swap++;
    			}
    		}
    	}
    	if(swap==0)
    	{
    		break;
    	}
    }


    for(int i=n-1;i>=0;i--)
    {
    	cout << name[i] << endl;
    	t--;
    	if(t==0)
    	{
    		break;
    	}
    }
   
    return 0;
}
