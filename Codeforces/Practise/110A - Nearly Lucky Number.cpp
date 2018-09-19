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

bool isLucky(int a)
{
    int c =1;
    if(a>0)
    {
        while(a>0)
        {
            if(a%10==7 || a%10==4)
            {
                a/=10;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    string n;
    in n;
    
    int count=0;
    int i=0;
    while(i<n.length())
    {
        if(n[i]=='7' || n[i]=='4')
        {
            count++;
        }
        i++;
    }
    
    if(isLucky(count))
    {
        out "YES";
    }
    else
    {
        out "NO";
    }
    return 0;
}