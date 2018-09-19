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

bool isLucky(int n)
{
    while (n != 0)
    {
        if (n % 10 != 4 && n % 10 != 7)
        {
            return false;
        }
        n /= 10;
    }
    return true;
}

bool is_almost_Lucky(int n)
{
    if (isLucky(n))
    {
        return true;
    }

    for (int i = 2; i * i <= n; ++i)
    {
        if (n % i == 0 && (isLucky(i) || isLucky(n / i)))
        {
            return true;
        }
    }

    return false;
}

int main()
{
    int n;
    in n;
    
    if(is_almost_Lucky(n))
    {
        out "YES";
    }
    else
    {
        out "NO";
    }
    return 0;
}