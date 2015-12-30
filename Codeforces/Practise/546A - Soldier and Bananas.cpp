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
    int k,n,w;
    in k;
    in n;
    in w;
    int i=1;
    int cost=0;
    
    while(i<=w)
    {
        cost+=i*k;
        i++;
    }
    
    if(cost>n)
    {
        out cost - n;
    }
    else
    {
        out 0;
    }
    return 0;
}