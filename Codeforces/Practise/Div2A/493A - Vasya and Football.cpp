#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define min(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;
 
int main()
{
    string home;
    string away;
    in home;
    in away;
    
    int fouls;
    in fouls;
    
    int min;
    string team_pos;
    string card;
    int home_arr[99];
    int away_arr[99];
    int num;
    
    for(int i=0;i<99;i++)
    {
        home_arr[i]=0;
        away_arr[i]=0;
    }
    
    
    while(fouls--)
    {
        in min;
        in team_pos;
        in num;
        in card; 
        if(team_pos=="h" && home_arr[num-1]<2)
        {
            if(card=="y")
            {
                home_arr[num-1]+=1;
            }
            else if(card=="r")
            {
                home_arr[num-1]+=2;
            }
            
            if(home_arr[num-1]>=2)
            {
                cout<<home<<" "<<num<<" "<<min<<endl;
            }
        }
        else if(team_pos=="a" && away_arr[num-1]<2)
        {
            if(card=="y")
            {
                away_arr[num-1]+=1;
            }
            else if(card=="r")
            {
                away_arr[num-1]+=2;
            }
            
            if(away_arr[num-1]>=2)
            {
                cout<<away<<" "<<num<<" "<<min<<endl;
            }
        }
    }
    
    return 0;
}
