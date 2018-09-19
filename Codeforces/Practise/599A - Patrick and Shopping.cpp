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
    ll d1,d2,d3;
    
    in d1;
    in d2;
    in d3;
    
    out min(min(d1+d2+d3,2*(d1+d3)),min(2*(d1+d2),2*(d2+d3)));
    
    return 0;
}
