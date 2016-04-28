#include <iostream>
using namespace std;
int n,m,v[1000];
int main()
{
	int a[2]={0},c,i,j,k;
	cin>>n;
	for(i=0;i<n;i++)
	   cin>>v[i];
	c=0;
	k=n-1;
	for(i=0;i<n;i++)
	{
		if(v[c]<v[k])
			a[i%2]+=v[k--];
		else 
			a[i%2]+=v[c++];
	}
	cout<<a[0]<<" "<<a[1];
	return 0;
}