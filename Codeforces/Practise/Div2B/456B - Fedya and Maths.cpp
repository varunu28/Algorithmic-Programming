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
    string s;
    in s;

    int last;

    if(s.length()>1)
    {
        last = atoi(s.substr(s.length()-2,s.length()).c_str());
    }
    else
    {
        last=atoi(s.c_str());
    }

    int sum=1;

    if(last%4==0)
    {
        sum+=7;
    }
    else if(last%4==1)
    {
        sum+=5;
    }
    else if(last%4==2)
    {
        sum+=13;
    }
    else if(last%4==3)
    {
        sum+=15;
    }

    if(last%2==0)
    {
        sum+=6;
    }
    else
    {
        sum+=4;
    }

    cout<<sum%5;
    return 0;
}
