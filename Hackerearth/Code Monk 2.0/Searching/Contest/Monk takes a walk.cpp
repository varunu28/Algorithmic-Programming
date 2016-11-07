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
	int t;
	cin >> t;
	ull count;
	string s;
	while(t--)
	{
		cin >> s;
		count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
				count++;
			if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
				count++;
		}
		cout << count << endl;
	}
	return 0;
}
