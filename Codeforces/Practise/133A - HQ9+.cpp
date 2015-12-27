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

int main()
{
    string inp;
    in(inp);
    
    string ans = "NO";
    
    for(int i=0;i<inp.length();i++)
    {
        if(inp[i]=='H' || inp[i]=='Q' || inp[i]=='9')
        {
            ans = "YES";
            break;
        }
    }
    
    out ans;
    return 0;
}