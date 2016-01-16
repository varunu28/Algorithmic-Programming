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

int main() {
    int n;
    in n;
    int a[n];
    int b[n];
    int c[n];
    int j=0;
    
    while(j<n)
    {
        in a[j];
        in b[j];
        in c[j];
        j++;
    }
    
    int sum1=0;
    int sum2=0;
    int sum3=0;
    
    for(int i=0;i<n;i++)
    {
        sum1+=a[i];
        sum2+=b[i];
        sum3+=c[i];
    }
    
    
    if(sum1==0 && sum2==0 && sum3==0)
    {
        out "YES";
    }
    else
    {
        out "NO";
    }
    
    return 0;
}