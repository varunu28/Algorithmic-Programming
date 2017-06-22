#include <iostream>
#include<algorithm>
#include<string>
using namespace std;
 
bool wayToSort(char i, char j) { return i > j; }
 
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
    	string s;
    	cin >> s;
    	int start,end;
    	cin >> start >> end;
    	char rep[end-start+1];
    	int i = start;
    	int j =0;
    	while(i <= end)
    	{
    		rep[j] = s[i];
    		i++;
    		j++;
    	}
    	rep[j] = '\0';
    	sort(rep,rep+(end-start+1),wayToSort);
    	string str(rep);
    	//cout << s << endl;
    	j = 0;
    	for(i=0;i<s.length();i++)
    	{
    		//cout << s[i] << endl;
    		if(i>=start && i<= end)
    		{
    			s[i]=rep[j];
    			j++;
    		}
    		
    	}
    	cout << s << endl;
    }
    return 0;
}