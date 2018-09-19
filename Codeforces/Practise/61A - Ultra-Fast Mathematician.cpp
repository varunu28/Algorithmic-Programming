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
    string s1;
    string s2;
    in s1;
    in s2;
    
    int len=s1.length();
    
    char ans[len];
    
    for(int i=0;i<len;i++)
    {
        if(s1[i]!=s2[i])
        {
            ans[i]='1';
        }
        else
        {
            ans[i]='0';
        }
    }
    
    for(int i=0;i<len;i++)
    {
        out ans[i];
    }
	return 0;
}