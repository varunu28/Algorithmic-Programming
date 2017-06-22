#include <iostream>
#include <string>
using namespace std;
 
int main()
{
    int t;
    cin >> t;
    unsigned long long n;
    while(t--)
    {
    	cin >> n;
    	bool valid = true;
    	if(n%21==0)
    		valid = false;
    	if(valid)
    	{
    		string s = to_string(n);
    		for(int i=0;i<s.length()-1;i++)
    		{
    			if(s[i]=='2' && s[i+1]=='1')
    			{
    				valid = false;
    				break;
    			}
    		}
    	}
    	if(valid)
    		cout << "The streak lives still in our heart!" << endl;
    	else
    		cout << "The streak is broken!" << endl;
    }
    return 0;
}