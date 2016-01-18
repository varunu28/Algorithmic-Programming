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
    int s,n;
    in s;
    in n;
    int x[n];
    int y[n];
    int stat[n];
    int i=0;
    
    while(i<n)
    {
        in x[i];
        in y[i];
        stat[i]=0;
        i++;
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(s>x[j] && stat[j]==0)
            {
                //out x[j];
                //out y[j];
                stat[j]=1;
                s+=y[j];
            }
        }
    }
    
    int c=1;
    for(int i=0;i<n;i++)
    {
        if(stat[i]==0)
        {
            c=0;
            break;
        }
    }
    
    if(c==1)
    {
        out "YES";
    }
    else
    {
        out "NO";
    }
    return 0;
}

