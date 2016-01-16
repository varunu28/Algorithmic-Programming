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
 
int main()
{
    string s1,s2,s3,s4;
    in s1;
    in s2;
    in s4;
    
    s3 =  s1+s2;
    
    sort(s3.begin(), s3.end());
    sort(s4.begin(), s4.end());
    
    if(s3==s4)
    {
        out "YES";
    }
    else
    {
        out "NO";
    }

    return 0;
}