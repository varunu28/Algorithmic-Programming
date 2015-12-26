#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define M 100002
#define FOR(l)   for(int k=0; k<l; k++)
#define Si set<int>
#define Mii map<int,int>
#define Mss map<string,string>
#define Vi vector<int>
#define Di deque<int>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    string s;
    in(s);
    string ans="NO";
    int c;
    int start=-1;
    FOR(s.size())
    {
        if(s[k] != start)
        {
            start = s[k]; 
            c = 0;
            
        }
        ++c; 
        if(c >= 7)
        {
            ans = "YES"; 
            break;
            
        }
    }
    out(ans);
    return 0;
}