#include <iostream>
#include<algorithm>

using namespace std;

int main()
{
    long long a;
    cin>>a;
    
    int c=1;
    
    while(a>1)
    {
        c+=a%2;
        a/=2;
        
    }
    
    cout<<c<<endl;
    return 0;
}