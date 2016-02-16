#include <iostream>
using namespace std;

int main()
{
    int sum=0;
    int n;
    for(int i=0;i<5;i++)
    {
        
        cin>>n;
        sum+=n;
    }
    
    if(sum%5==0&&sum/5>=1)
    {
        cout<<sum/5<<endl;
    }
    else
    {
        cout<<-1<<endl;
    }
    return 0;
}