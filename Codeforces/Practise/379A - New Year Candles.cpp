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
    int a,b;
    in a;
    in b;
    int rem=0;
    int hours =0;
    
    while(a!=0)
    {
        hours+=a;
        rem+=a%b;
        a=a/b;
        if(rem>=b)
        {
            a+=1;
            rem-=b;
        }
    }
    out hours;
    return 0;
}