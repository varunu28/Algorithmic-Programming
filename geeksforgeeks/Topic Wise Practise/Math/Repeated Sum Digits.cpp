#include <iostream>
using namespace std;

int main() {
	//code
	int t;
	cin >> t;
	while(t--)
	{
	    int n;
	    cin >> n;
	    if(n/10==0)
	    {
	        cout << n << endl;
	    }
	    else
	    {
	        while(n/10!=0)
	        {
	            int sum = 0;
	            while(n>0)
	            {
	                sum += n%10;
	                n /= 10;
	            }
	            n = sum;
	        }
	        cout << n << endl;
	    }
	}
	return 0;
}