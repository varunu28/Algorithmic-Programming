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
#define c 1000000007

using namespace std;

inline
void use_io_optimizations()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
}

long long gcd(int a,int b)
{
    if(b == 0) {
            return a;
    }
    else {
        return gcd(b, a % b);
    }
}

ln mod(ln m,ln n)
{
    ln ans=1;
    while(n!=0)
    {
        if(n%2==1)
            ans = (ans*m)%c;
        m = (m*m)%c;
        n = n/2;
    }
    return ans;
}

int main()
{
    int n;
    cin>>n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    
    ln gcd_temp = a[0];
    
    for(int i=1;i<n;i++)
    {
        gcd_temp=gcd(gcd_temp,a[i]);
    }
   
    ln prod=a[0];
    
    for(int i=1;i<n;i++)
    {
        prod=(prod*a[i])%c;
    }
    
    ln ans= mod(prod,gcd_temp);

    cout<<ans<<endl;
    
    return 0;
}
