#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define miN(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;
 
int main()
{
    ll n,x,count;
    ll a[n*n];
    
    in n;
    in x;
    
    count=0;
    
    for(int i=1;i<=n;i++)
    {
        if(x%i==0 && x/i<=n)
        {
            count++;
        }
    }
    
    out count;
    return 0;
}
