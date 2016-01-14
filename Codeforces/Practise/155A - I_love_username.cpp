#include <bits/stdc++.h>
#include <ctype.h>
#define in cin>>
#define ln long long 
#define out cout<<
#define M 100002
#define FOR(l)   for(int k=0; k<l; k++)
#define Si set<int>
#define Mii map<int,int>
#define Mss map<string,string>
#define Vi vector<int>
#define Di deque<int>
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define miN(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;

int main()
{
    int n;
    in n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        in a[i];
    }
    
    int min=a[0];
    int max=a[0];
    int count=0;
    
    for(int i=1;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
            count++;
        }
        if(a[i]<min)
        {
            min=a[i];
            count++;
        }
    }
    
    out count;
    return 0;
}
