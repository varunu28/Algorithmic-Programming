#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define min(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;

int H[4154552],i,n,a,p;
int main(){
	in p;
	in n;
	for(i=1;i<=n;i++){
		in a;
		
		if(H[a%p]){
			out i;
			return 0;
		}
		H[a%p]=1;
	}
	out -1;
}
