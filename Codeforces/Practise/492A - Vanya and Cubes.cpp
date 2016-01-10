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
    ln n;
    in n;
    int var=1;
    int count=0;
    ln total=0;
    while(true)
    {
        int add=0;
        int i=1;
        while(i<=var)
        {
            add+=i;
            i++;
        }
        total+=add;
        if(total>n)
        {
            break;
        }
        else
        {
            var++;
            count++;
        }
    }
    out count;
    return 0;
}