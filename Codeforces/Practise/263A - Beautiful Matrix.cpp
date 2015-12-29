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
    int a[5][5];
    int x,y;
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            in a[i][j];
            if(a[i][j]==1)
            {
                x=i;
                y=j;
            }
        }
    }
    int count=0;
    while(x!=2)
    {
        if(x>2)
        {
            x--;
            count++;
        }
        if(x<2)
        {
            x++;
            count++;
        }
    }
    while(y!=2)
    {
        if(y>2)
        {
            y--;
            count++;
        }
        if(y<2)
        {
            y++;
            count++;
        }
    }
    out count;
    
    return 0;
}