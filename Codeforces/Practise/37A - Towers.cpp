#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    
    sort(a,a+n);
    
    
    int num=1;
    int h = 1;
    int mid_h=1;
    
    for(int i=0;i<n-1;i++)
    {
        if(a[i]!=a[i+1])
        {
           num++;
        }
    }
    
    for(int i=0;i<n;i++)
    {
        if(a[i]==a[i+1])
        {
            mid_h++;
        }
        else
        {
            if(mid_h>h)
            {
                h=mid_h;
            }
            mid_h=1;
        }
    }
    
    cout<<h<<endl;
    cout<<num<<endl;
    return 0;
}