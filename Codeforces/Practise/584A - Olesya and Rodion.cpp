#include <iostream>
#include<algorithm>

using namespace std;

int main()
{
    unsigned long long  n,t;
    
    cin>>n>>t;
    
    if(n<2&&t>9)
        cout<<"-1";
    else
    {
        if(t<10)
            while(n--)
                cout<<t;
        else
        {
            n-=2;
            while(n--)
                cout<<1;
                cout<<t;
            
        }
    }
    return 0;
}