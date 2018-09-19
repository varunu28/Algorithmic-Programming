#include <bits/stdc++.h>
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
    ios_base::sync_with_stdio(false);
    
    int n;
    in(n);
    int cap_max=0;
    int cap=0;
    while(n>0)
    {
        n--;
        int get_in;
        int get_out;
        in(get_out);
        in(get_in);
        cap=cap-get_out+get_in;
        
        if(cap>=cap_max)
        {
            cap_max=cap;
        }
    }
    
    out(cap_max);
    return 0;
}