#include <iostream>
using namespace std;
 
int main()
{
	unsigned long long int n;
	cin >> n;
	unsigned long long int a[n],b[n];
	
	for(unsigned long long int i = 0; i<n; i++)
	{
		cin >> a[i];
	}
	for(unsigned long long int i = 0; i<n; i++)
	{
		cin >> b[i];
	}
	
	
	for(unsigned long long int i = 0; i<n; i++)
	{
		cout << a[i] + b[i] << " ";
	}
    return 0;
}