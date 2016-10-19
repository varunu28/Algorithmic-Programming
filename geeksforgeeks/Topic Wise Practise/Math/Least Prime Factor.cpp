#include <iostream>
using namespace std;
bool isPrime(int n)
{
    if(n==1 || n==2 || n==3) return true;
    int i = 2;
    while(i <= n/2)
    {
        if(n%i==0)
        {
            return false;
        }
        i++;
    }
    return true;
}

int main() {
	//code
	int t;
	cin >> t;
	
	while(t--)
	{
	    int n;
	    cin >> n;
	    int a[n];
	    for(int i=1;i<=n;i++)
	    {
	        if(isPrime(i))
	        {
	            a[i-1] = i;
	        }
	        else
	        {
	            int j = 2;
	            while(j<=i/2)
	            {
	                if(i%j==0 && isPrime(j))
	                {
	                    a[i-1] = j;
	                    break;
	                }
	                j++;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        cout << a[i] << " ";
	    }
	    cout << endl;
	}
	return 0;
}