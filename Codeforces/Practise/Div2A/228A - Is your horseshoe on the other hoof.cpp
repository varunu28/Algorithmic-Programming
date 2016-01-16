#include <bits/stdc++.h>

#include <ctype.h>
#define in cin>>
#define out cout<<
#define M 100002
#define FOR(l)   for(int k=0; k<l; k++)
#define Si set<int>
#define Mii map<int,int>
#define Mss map<string,string>
#define Vi vector<int>
#define Di deque<int>
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define miN(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;
 
int main(){
	int shoe[4];
	for(int i=0;i<4;i++)
	{
	    in shoe[i];
	}
	
	sort(shoe,shoe+4);
	int count=0;
	
	for(int i=0;i<4;i++)
	{
	    if(shoe[i]==shoe[i+1])
	    {
	        count++;
	    }
	}
	
	out count;
	return 0;
}