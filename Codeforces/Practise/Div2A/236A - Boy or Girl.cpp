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

int main()
{
    string str;
    in str;
    int n=str.length();
    int dist_count=0;
    
    for(int i=0;i<n;i++)
    {
        int count=0;
        for(int k=0;k<n;k++)
        {
            if(str[k]==str[i])
            {
                count++;
            }
        }
        
        if(count==1)
        {
            dist_count++;
        }
        else
        {
            char curr=str[i];
            str.erase(std::remove(str.begin(), str.end(), curr), str.end());
            n=str.length();
            
            dist_count++;
            --i;
        }
    }
    
    if(dist_count%2==0)
    {
        out "CHAT WITH HER!";
    }
    else
    {
        out "IGNORE HIM!";
    }
    
    return 0;
}