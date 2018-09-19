#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
#define fastScan ios_base::sync_with_stdio(0); cin.tie(NULL);
#define rep(i,n) for(ll i=0; i<(n); i++)
#define repp(i,ed,b) for(ll i=ed; i<=(b); i++)
#define repp2(i,b,ed) for(ll i=b; i>=(ed); i--)
#define io ios_base::sync_with_stdio(false); 
#define sc(n) scanf("%lld",&n);


int main()
{
	io 
	int n,m;
	cin >> n >> m;
	int sum = 0;
	int t = 1;
	while(true)
	{
	    sum += t;
	    t++;
	    if(t>n)
	    {
	        t=1;
	    }
	    
	    if(sum+t > m)
	    {
	        cout << m - sum;
	        break;
	    }

	    if(sum == m)
	    {
	    	cout << 0;
	    	break;
	    }
	}
	return 0;
}
