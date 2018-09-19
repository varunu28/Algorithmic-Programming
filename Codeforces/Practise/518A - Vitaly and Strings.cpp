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
    string s1;
    string s2;
    
    in s1;
    in s2;
    
    int status=0;
    
    int n = s1.length()-1;
    
    while(n>=0)
    {
        if(int(s1[n])!=122)
        {
            s1[n]=int(s1[n])+1;
            if(s2>s1)
            {
                status=1;
                break;
            }
        }
        else
        {
            s1[n]='a';
        }
        
        n--;
    }
    
    if(status)
    {
        out s1;
    }
    else
    {
        out "No such string";
    }
    return 0;
}

