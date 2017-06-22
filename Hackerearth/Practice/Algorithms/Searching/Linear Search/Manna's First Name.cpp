#include <iostream>
using namespace std;
 
int main()
{
    int n;
    cin >> n;
    while(n--)
    {
    	string s;
    	cin >> s;
    	int suvo=0;
    	int suvojit=0;
    	
    	if(s.length() > 4)
    	{
	    	for(int i=0;i<s.length()-3;i++)
	    	{
	    		if(s[i]=='S' && s[i+1] =='U' && s[i+2]=='V' && s[i+3]=='O')
	    		{
	    			if(i!=s.length()-4)
	    			{
		    			if(s[i+4]!='J' || s[i+5]!='I' || s[i+6]!='T')
		    				suvo++;
		    			else
			    			suvojit++;
	    			}
	    			else
	    			{
	     				suvo++;
	    			}
	    		}
	    	}
    	}
    	else
    	{
    		if(s.length()==4)
    		{
    			if(s[0]=='S' && s[1] =='U' && s[2]=='V' && s[3]=='O')
    				suvo++;
    		}
    	}
    	cout << "SUVO = " << suvo << ", ";
    	cout << "SUVOJIT = " << suvojit << endl;
    }
    return 0;
}