#include <iostream>
#include <string>  
using namespace std;
 
int main()
{
    string s;
    while(getline(cin, s))
    {
		
    	int k = -1;
    	for(int i = 0;i<s.length();i++)
    	{
    		if(s[i]=='/' && s[i+1]=='/' && i!=s.length()-1)
    		{
    			k = i;
    			break;
    		}
    	}
    	
    	
    	if(k==-1)
    	{
    		k = s.length();
    	}
    	
    	char rep[s.length()];
    	int j =0;
    	for(int i=0;i<k;i++)
    	{
    		if(i!=k-1 && s[i]=='-' && s[i+1]=='>')
    		{
    			rep[j] = '.';
    			i++;
    		}
    		else
    		{
    			rep[j] = s[i];
    		}
    		j++;
    	}
    	for(int i=k;i<s.length();i++)
    	{
    		rep[j] = s[i];
    		j++;
    	}
    	
    	rep[j] = '\0';
    	string new_s(rep);
    	cout << new_s << endl;
    }
    return 0;
}