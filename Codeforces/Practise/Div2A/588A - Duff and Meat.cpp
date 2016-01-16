#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define min(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;
 
int main()
{
    int n;
    in n;
    int a[n];
    int b[n];
    ull cost=0;
    ull price=10000000000;
    
    for(int i=0;i<n;i++)
    {
        in a[i];
        in b[i];
    }
    
    for(int i=0;i<n;i++)
    {
        price=min(price,b[i]);
        cost+=price*a[i];
    }
    
    out cost;
    
    return 0;
}
