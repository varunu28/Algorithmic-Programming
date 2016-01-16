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
    int flag=0;
    char s[205];
    string a="";
    in s;
    for(int i=0; i<strlen(s);) {
        if(s[i]=='W' && s[i+1]=='U' && s[i+2]=='B') {
            if(flag==0) a+=' ', i+=3, flag=1;
            else i+=3;
        }
        else a+=s[i], i++, flag=0;
    }
    out a;
    return 0;
}