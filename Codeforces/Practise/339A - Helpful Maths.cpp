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
    string inp;
    in inp;
    
    int n = inp.length()-(inp.length()/2);
    char a[n];
    int k=0;
    char plus='+';
    
    for(int i=0;i<inp.length();i++)
    {
        if(inp[i]!=plus)
        {
            a[k]=inp[i];
            k++;
        }
    }
    
    sort(a,a+n);
    
    
    for(int i=0;i<n;i++)
    {
        if(i!=n-1)
        {
            out(a[i]);
            out(plus);
        }
        else
        {
            out(a[i]);
        }
    }
    return 0;
}