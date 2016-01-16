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
    int a,b;
    in a;
    in b;
    
    int diff=min(a,b);
    a-=diff;
    b-=diff;
    
    int same=max(a,b);
    same/=2;
    
    out diff;
    out " ";
    out same;
    
    return 0;
}
