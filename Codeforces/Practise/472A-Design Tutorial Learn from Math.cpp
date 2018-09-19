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

bool isPrime(int n)
{
    int i=2;
    int c=1;
    while(i<=n/2)
    {
        if(n%i==0)
        {
            c=0;
            break;
        }
        i++;
    }
    return c;
}
int main()
{
    int n;
    in n;
    int num1=0,num2=0;
    
    for(int i=4;i<n;i++)
    {
            if(isPrime(i)==0)
            {
             if(isPrime(n-i)==0)   
             {
                 num1=i;
                 num2=n-i;
                 break;
             }
            }
    }
    
    out num1;
    out " ";
    out num2;
    return 0;
}