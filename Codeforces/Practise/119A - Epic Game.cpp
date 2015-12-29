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

int gcd(int a,int b)
{
     if (b == 0) 
     {
        return a;
    }
    return gcd(b, a % b);
}

int main()
{
    int a,b,n;
    in a;
    in b;
    in n;
    
    int i=1;
    int gcd_val;
    
    while(true)
    {
        if(i==1)
        {
            gcd_val=gcd(a,n);
            if(n>=gcd_val)
            {
                n-=gcd_val;
                i--;
            }
            else
            {
                break;
            }
        }
        else
        {
            gcd_val=gcd(b,n);
            if(n>=gcd_val)
            {
                n-=gcd_val;
                i++;
            }
            else
            {
                break;
            }
        }
    }
    
    if(i==1)
    {
        out "1";
    }
    else
    {
        out "0";
    }
    return 0;
}