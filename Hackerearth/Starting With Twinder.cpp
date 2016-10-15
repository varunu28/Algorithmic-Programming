#include <iostream>
using namespace std;

int main()
{
    int m,n,h,l;
    cin >> m;
    cin >> n;
    
    while(n--)
    {
    	cin >> h >> l;
    	if(h<m || l<m)
    	{
    		cout << "UPLOAD ANOTHER" << endl;
    	}
    	else if(h==l)
    	{
    		cout << "ACCEPTED" << endl;
    	}
    	else
    	{
    		cout << "CROP IT" << endl;
    	}
    }
    return 0;
}
