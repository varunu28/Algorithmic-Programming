#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int count=0;
    while(n>0)
    {
        int a[3];
        int c=0;
        for(int i=0;i<3;i++)
        {
            cin>>a[i];
            if(a[i]==1)
            {
                c++;
            }
        }
        if(c>=2)
            {
                count++;
            }
        n--;
    }
    cout<<count<<endl;
    return 0;
}