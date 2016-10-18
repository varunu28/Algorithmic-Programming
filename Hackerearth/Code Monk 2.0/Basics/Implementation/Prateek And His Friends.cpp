#include <iostream>
#include <string> 
using namespace std;

int main()
{
	int t,n;
	unsigned long long x;
	unsigned long long sum;
	cin >> t;

	while(t--)
	{
		cin >> n;
		cin >> x;
		int a[n];
		for(int i=0;i<n;i++)
		{
			cin >> a[i];
		}

		bool ans = false;

		for(int i=0;i<n;i++)
		{
			sum = 0;

			for(int j=i;j<n;j++)
			{
				sum += a[j];
				if(sum == x)
				{
					ans = true;
					break;
				}
				if(sum > x)
				{
					break;
				}
			}

			if(ans)
			{
				cout << "YES"<<endl;
				break;
			}
		}
		if(!ans)
		{
			cout << "NO" << endl;
		}
	}	
	return 0;
}
