#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define M 100002
#define FOR(i,k,l)   for(int i(k); i<l; i++)
#define Si set<int>
#define Mii map<int,int>
#define Mss map<string,string>
#define Vi vector<int>
#define Di deque<int>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    int n,taxi=0;
    
        in(n);
        Vi v(M);
    
        FOR(i,0,n){
            in(v[i]);
        }
        sort(v.begin(),v.end());
    
            int i=v.size()-1;
            int k=0;
            while(k!= i){
                if(v[i]+ v[k]<=4){
                    v[i]+=v[k];
                    k++;
                }
                else{
                    i--;
                    taxi++;
                }
            }
        out(taxi+1);
    
    
    return 0;
}