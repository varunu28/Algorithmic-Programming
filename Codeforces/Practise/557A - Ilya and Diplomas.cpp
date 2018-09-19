#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define min(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;
 
int main()
{
    int n;
    in n;
    int min[3];
    int max[3];
    int dip[3];
    
    for(int i=0;i<n;i++)
    {
        in min[i];
        in max[i];
    }
    
    while(true)
    {
        if(n-max[0]>=min[1]+min[2])
        {
            dip[0]=max[0];
            n-=max[0];
            break;
        }
        max[0]--;
    }
    
    while(true)
    {
        if(n-max[1]>=min[2])
        {
            dip[1]=max[1];
            n-=max[1];
            break;
        }
        max[1]--;
    }
    
    dip[2]=min(n,max[2]);
    
    cout<<dip[0]<<" "<<dip[1]<<" "<<dip[2];
    
    return 0;
}
