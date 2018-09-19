#include <bits/stdc++.h>
#include <ctype.h>
#define in cin>>
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

int main() {
    int n;
    in n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        in a[i];
    }
    
    int set=1;
    
    for(int i=0;i<n;i++)
    {
        if(i!=n-1)
        {
            if(a[i]!=a[i+1])
            {
                set++;
            }
        }
    }
    
    out set;
    return 0;
}