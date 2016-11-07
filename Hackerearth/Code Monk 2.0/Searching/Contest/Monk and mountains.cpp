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
	ull n,q;
	cin >> n >> q;
	ull l[2*n];

	for(ull i=0;i<2*n;i+=2)
	{
		cin >> l[i];
		cin >> l[i+1];
	}

	ull r,ans;
	while(q--)
	{
		cin >> r;
		for(ull i=0;i<2*n;i+=2)
		{
			if(l[i+1]-l[i] + 1 >= r)
			{
				ull a[l[i+1]-l[i] + 1];
				for(ull j=0;j<l[i+1]-l[i] + 1;j++)
				{
					a[j] = l[i] + j;
					r--;
					if(r==0)
						ans = a[j];
				}
			}
			else
			{
				r -= l[i+1]-l[i] + 1;
			}
		}
		cout << ans << endl;
	}
	return 0;
}
