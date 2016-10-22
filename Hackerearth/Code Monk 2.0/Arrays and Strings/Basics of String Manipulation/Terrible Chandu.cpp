#include <iostream>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    while(t){
    	t--;
    	string a,rev_a;
    	cin>>a;
    	int n=a.size()-1;
    	while(n>=0){
    		rev_a+=a[n];
    		n--;
    	}
    	cout<<rev_a<<endl;
    }
    return 0;
}