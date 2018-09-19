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
    int sum=0;
    int even_count=0;
    int odd_count=0;
    
    for(int i=0;i<n;i++)
    {
        in a[i];
        sum+=a[i];
        if(a[i]%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
    }
    
    if(sum%2==0)
    {
        out even_count;
    }
    else
    {
        out odd_count;
    }
    return 0;
}

