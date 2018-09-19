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
    string inp1;
    string inp2;
    in(inp1);
    in(inp2);
    
    for(int i=0;i<inp1.length();i++)
    {
        inp1[i]=tolower(inp1[i]);
        inp2[i]=tolower(inp2[i]);
    }
    int order=0;
    
    for(int i=0;i<inp1.length();i++)
    {
        if(inp1[i]>inp2[i])
        {
            order=1;
            break;
        }
        else if(inp1[i]<inp2[i])
        {
            order=-1;
            break;
        }
    }
    
    out(order);
    return 0;
}