#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define M 100002
#define FOR(i,k,l)   for(int i(k); i<l; i++)
#define Si set<int>
#define Mii map<int,int>
#define Mss map<string,string>
#define Vi vector<int>
#define Di deque<int>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    int n;
    in(n);
    int s=0;
    
    while(n>0)
    {
        string inp;
        in(inp);
        
        if(inp=="X++" || inp=="++X")
        {
            s++;
        }
        else if(inp=="X--" || inp=="--X")
        {
            s--;
        }
        n--;
    }
    out(s);
    return 0;
}