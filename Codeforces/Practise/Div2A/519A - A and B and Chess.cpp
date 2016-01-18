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
    int n=8;
    int white=0;
    int black=0;
    string s;
    
    while(n--)
    {
        in s;
        int i=0;
        while(i<8)
        {
            if(isupper(s[i]))
            {
                if(s[i]=='Q')white+=9;
                if(s[i]=='R')white+=5;
                if(s[i]=='B')white+=3;
                if(s[i]=='N')white+=3;
                if(s[i]=='P')white+=1;
            }
            else if(islower(s[i]))
            {
                if(s[i]=='q')black+=9;
                if(s[i]=='r')black+=5;
                if(s[i]=='b')black+=3;
                if(s[i]=='n')black+=3;
                if(s[i]=='p')black+=1;
            }
            i++;
        }
    }
    
    //out white;
    //out black;
    
    if(white==black)
    {
        out "Draw";
    }
    else if(white>black)
    {
        out "White";
    }
    else if(white<black)
    {
        out "Black";
    }
    return 0;
}

