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
 
int main(){
    int n;
    in n;
    int a[n];
    
    for(int i=0;i<n;i++)
    {
        a[i]=0;
    }
    
    int p;
    in p; 
    
    int p_lev;
    
    for(int i=0;i<p;i++)
    {
        in p_lev;
        if(a[p_lev-1]!=1)
        {
            a[p_lev-1]=1;
        }
    }
    
    int q;
    in q; 
    
    int q_lev;
    
    for(int i=0;i<q;i++)
    {
        in q_lev;
        if(a[q_lev-1]!=1)
        {
            a[q_lev-1]=1;
        }
    }
    
    int c=1;
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
        {
            c=0;
            break;
        }
    }
    
    if(c==0)
    {
        out "Oh, my keyboard!";
    }
    else
    {
        out "I become the guy.";
    }
	return 0;
}