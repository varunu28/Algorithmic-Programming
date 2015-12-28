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
    int n;
    in n;
    int arr[5]={1,1,1,1,1};
    
    int can_count=0;
    int i=0;
    int c=1;
    
    while(true)
    {
        can_count+=arr[i];
        if(can_count>=n)
        {
            break;
        }
        
        
        
        arr[i]*=2;
        i++;
        if(i==5)
        {
            i=0;
        }
    }
    
    if(i==0)
    {
        out "Sheldon";
    }
    else if(i==1)
    {
        out "Leonard";
    }
    else if(i==2)
    {
        out "Penny";
    }
    else if(i==3)
    {
        out "Rajesh";
    }
    else if(i==4)
    {
        out "Howard";
    }
    return 0;
}