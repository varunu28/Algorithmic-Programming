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
    int n,m;
    in n;
    in m;
    int a[m];
    
    for(int i=0;i<m;i++)
    {
        in a[i];
    }
    
    sort(a,a+m);
    
    int min = a[n-1]-a[0];
    
    for (int i = 1; i <= m - n; ++i)
    {
        if (a[i+n-1] - a[i] < min)
        {
            min= a[i+n-1] - a[i];
        }
    }
    
    out min;
    return 0;
}