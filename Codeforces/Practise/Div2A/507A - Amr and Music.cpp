#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define min(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;
struct data{
	int id;
	int a;
	friend bool operator<(data A, data B){ return A.a < B.a; }
}D[100];
vector<int> choosen;
int main(){
	int n, k;
	scanf("%d%d", &n, &k);
	for (int i = 0; i < n; i++)
		scanf("%d", &D[i].a), D[i].id = i;
	sort(D, D + n);
	for (int i = 0; i<n && k >= D[i].a; i++)
		k -= D[i].a, choosen.push_back(D[i].id + 1);
	printf("%d\n", choosen.size());
	for (int i = 0; i < choosen.size(); i++){
		if (i != 0)
			putchar(' ');
		printf("%d", choosen[i]);
	}
	putchar('\n');
	return 0;
}
