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

inline
void use_io_optimizations()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
}

bool isPrime(ln n)
{
    ln i=2;
    if(n==2)return true;
    if(n%2==0)return false;
    while(i<=sqrt(n))
    {
        if(n%i==0)
        {
            return false;
        }
        i++;
    }
    return true;
}

int main()
{
    ln n=2;
    ln sum=0;
    ln count=0;
    
    while(count!=1000)
    {
        if(isPrime(n))
        {
            sum+=n;
            count++;
        }
        n++;
    }
    cout<<sum;
    return 0;
}
