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
 
int main(){
    string a;
    while(getline(cin , a)){
        set <char> x;
        for(int i = 0; a[i]; i++){
            if(a[i] >= 'a' && a[i] <= 'z')
                x.insert(a[i]);
        }

        cout << x.size() << "\n";
    }
    return 0;
}