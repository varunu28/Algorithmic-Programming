#include <iostream>
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
    
    int s,t;
    cin>>s>>t;
    int sum1=0;
    int sum2=0;
    int sum=0;
    
    if(s==t)
    {
        cout<<0<<endl;
    }
    else
    {
       
        if(s>t)
        {
            //cout<<"A";
            if(s==n)
            {
                for(int i=t-1;i<n-1;i++)
                {
                    //cout<<a[i]<<endl;
                    sum+=a[i];
                }
                
                cout<<min(sum,a[n-1])<<endl;
            }
            else
            {
                for(int i=t-1;i<s-1;i++)
                {
                    //cout<<a[i]<<endl;
                    sum1+=a[i];
                }
                for(int i=s-1;i<n;i++)
                {
                    sum2+=a[i];
                }
                for(int i=0;i<t-1;i++)
                {
                    sum2+=a[i];
                }
                cout<<min(sum1,sum2)<<endl;
            }
        }
        if(s<t)
        {
            for(int i=s-1;i<t-1;i++)
            {
                sum1+=a[i];
            }
            for(int i=t-1;i<n;i++)
            {
                sum2+=a[i];
            }
            for(int i=0;i<s-1;i++)
            {
                sum2+=a[i];
            }
            cout<<min(sum1,sum2)<<endl;
        }
    }
    return 0;
}