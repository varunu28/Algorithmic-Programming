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
    int a[10]={2,7,2,3,3,4,2,5,1,2},n;
    in n;
    out a[n/10]*a[n%10];
    return 0;
}

