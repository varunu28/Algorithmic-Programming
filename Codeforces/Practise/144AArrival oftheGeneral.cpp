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
    int n;
    in n;
    int a[n];
    
    int max,min,max_idx,min_idx;
    
    for(int i=0;i<n;i++)
    {
        in a[i];
    }
    
    max=min=a[0];
    max_idx=min_idx=0;
    
    for(int i=0;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
            max_idx=i;
        }
        if(a[i]<=min)
        {
            min=a[i];
            min_idx=i;
        }
    }
    int swap=0;
    
    if(max_idx-min_idx<0)
    {
        swap+=max_idx-0;
        swap+=(n-1)-min_idx;
    }
    else if(max_idx-min_idx>0)
    {
        swap+=max_idx-0;
        swap+=(n-1)-min_idx;
        swap--;
    }
    
    out swap;
    return 0;
}
