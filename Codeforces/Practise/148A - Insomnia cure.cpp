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
    int k,l,m,n,d;
    in k;
    in l;
    in m;
    in n;
    in d;
    
    int arr[d];
    std::fill(arr, arr + d, 1);
    
    for(int i=k-1;i<d;i+=k)
    {
        if(arr[i]!=0)
        {
            arr[i]=0;
        }
    }
    
    for(int i=l-1;i<d;i+=l)
    {
        if(arr[i]!=0)
        {
            arr[i]=0;
        }
    }
    
    for(int i=m-1;i<d;i+=m)
    {
        if(arr[i]!=0)
        {
            arr[i]=0;
        }
    }
    
    for(int i=n-1;i<d;i+=n)
    {
        if(arr[i]!=0)
        {
            arr[i]=0;
        }
    }
    
    int count =0;
    
    for(int i=0;i<d;i++)
    {
        if(arr[i]==0)
        {
            count++;
        }
    }
    
    out count;
    return 0;
}