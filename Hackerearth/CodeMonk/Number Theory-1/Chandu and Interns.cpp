#include <bits/stdc++.h>

using namespace std;

#define lli long long int
#define MAX 10000001
int primes[MAX];
int main()
{	ios_base::sync_with_stdio(0);
	lli i,j,n;
	primes[0] = 0;
    primes[1] = 0;
    for(i = 2; ((i*i)<=MAX); i++)
    {	if(primes[i]==0)
    	{	for(j=2;((j*i)<=MAX);j++)
    			primes[i*j]=1;
    	}
    }
	cin>>n;
	lli sq,x;
    for(i=0;i<n;i++)
    {	cin>>x;
        sq = sqrt(x);
        if(!primes[x])
    		cout<<"NO\n";
    	else if(sq*sq == x && !primes[sq])
    		cout<<"NO\n";
    	else
            cout<<"YES\n";
    }
    return 0;
}
