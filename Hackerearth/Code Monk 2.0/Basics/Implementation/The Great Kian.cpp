#include <iostream>
using namespace std;
 
int main()
{
    int n;
    cin >> n;
    unsigned long long a[n];
    
    for(int i=0;i<n;i++)
    {
    	cin >> a[i];
    }
    int i = 0;
    int count = 3;
    
    while(count--)
    {
    	unsigned long long sum = 0;
    	int j = i;
    	while(j<n)
    	{
    		sum += a[j];
    		j += 3;
    	}
    	cout << sum << " ";
    	i++;
    }
    return 0;
}