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
    int n;
    in n;
    string s;
    in s;
    int c=97;
    char arr[26];
    
    for(int i=0;i<26;i++)
    {
        arr[i]=c;
        c++;
    }
    
    int ans=1;
    
    for(int i=0;i<n;i++)
    {
        s[i]=char(tolower(s[i]));
    }
    
    for(int i=0;i<26;i++)
    {
        int check=0;
        for(int j=0;j<n;j++)
        {
            if(arr[i]==s[j])
            {
                check=1;
                break;
            }
        }
        if(check==0)
        {
            ans=0;
            break;
        }
    }
    
    if(ans==1)
    {
        out "YES";
    }
    else
    {
        out "NO";
    }

    return 0;
}