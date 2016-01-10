#include <bits/stdc++.h>
#include <ctype.h>
#define in cin>>
#define ln long long 
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
 
int min(int a, int b)
{
    if(a<=b )
        return a;
    else
        return b;
}

int main()
{
    int n, m, a, b;
    int ans, ans1, ans2;
    while(cin >> n >> m >> a >> b)
    {
        if((m*a)<=b)
        {
            ans  = a*n;
            cout << ans << endl;
        }
        else
        {
            ans1 = ((n/m)*b) + b;
            ans2 = ((n/m)*b) + (n%m)*a;
            ans = min(ans1, ans2);
            cout << ans << endl;
        }
    }
    return 0;
}