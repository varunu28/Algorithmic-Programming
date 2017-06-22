#include <iostream>
using namespace std;
 
int main()
{
    int q;
    cin >> q;
    int a[1000000];
    int top = -1;
    int inp1,inp2;
    
    while(q--)
    {
    	cin >> inp1;
    	if(inp1==1)
    	{
    		if(top==-1)
    		{
    			cout << "No Food" << endl;
    		}
    		else
    		{
    			cout << a[top] << endl;
    			top -=1;
    		}
    	}
    	else
    	{
    		cin >> inp2;
    		top += 1;
    		a[top] = inp2;
    	}
    }
    return 0;
}