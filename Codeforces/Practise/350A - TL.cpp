#include <bits/stdc++.h>
#include <ctype.h>
#define in cin>>
#define ln long long 
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
    int n,m;
    in n;
    in m;
    int a[n];
    int b[m];
    
    for(int i=0;i<n;i++)
    {
        in a[i];
    }
    
    for(int i=0;i<m;i++)
    {
        in b[i];
    }
    
    sort(a,a+n);
    sort(b,b+m);
    
    int v=a[0];
    int p=a[n-1];
    int c=b[0];
    
    if(max(2*v,p)<c)
    {
        out max(2*v,p);
    }
    else
    {
        out -1;
    }
    
    
    return 0;
}
