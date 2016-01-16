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

int main()
{
    int year;
    in year;
    year++;
    int n,c;
    
    while(true)
    {
        c=1;
        int a[10]={0,0,0,0,0,0,0,0,0,0};
        n=year;
        
        
        while(n>0)
        {
            if(a[n%10]!=0)
            {
                c=0;
                break;
            }
            else
            {
                a[n%10]=1;
                n/=10;
            }
        }
        
        if(c==1)
        {
            break;
        }
        else
        {
            year++;
        }
    }
    out year;
    return 0;
}