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
    int n,t;
    in n;
    in t;
    char temp;
    
    string s;
    in s;
    
    while(t>0)
    {
        t--;
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                if(s[i]=='B' && s[i+1]=='G')
                {
                    temp=s[i];
                    s[i]=s[i+1];
                    s[i+1]=temp;
                    i++;
                }
            }
        }
    }
    
    out s;
    return 0;
}