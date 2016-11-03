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
	ll t;
	cin >> t;
	ull a[t];
	rep(i,t){
		cin >> a[i];
	}
	ll q,num;
	cin >> q;
	ull tar,sum;
	rep(i,q)
	{
		sum = 0;
		cin >> tar;
		rep(i,t)
		{
			sum += a[i];
			if(sum >= tar)
			{
				num = i+1;
				break;
			}
		}
		if(sum < tar)
		{
			cout << -1 << endl;
		}
		else
			cout << num << endl;
	}
	return 0;
}
