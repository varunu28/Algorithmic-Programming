#include <iostream>
#include <stdio.h>
using namespace std;
 
int main()
{
    long long i,n;
    scanf("%lld",&n);
    int num; //change this to long long if you change the range
    long long a[1001]={0};
    for(i=1;i<=n;i++)
    {
        scanf("%d",&num);
        ++a[num];
    }
    long long q;
    
    scanf("%lld",&q);
    for(i=1;i<=q;i++)
    {
        scanf("%d",&num);
        if(a[num]==0)
            cout<<"NOT PRESENT"<<endl;
        else
            cout<<a[num]<<endl;
    }
    return 0;
}