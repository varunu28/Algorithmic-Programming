#include <iostream>
using namespace std;
int main()
{
    int n,k,count=0;
    cin>>n;
    cin>>k;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    
    int target=a[k-1];
    
    for(int i=0;i<n;i++)
    {
        if(a[i]>=target && a[i]>0)
        {
            count++;
        }
    }

    cout<<count<<endl;
    return 0;
}
