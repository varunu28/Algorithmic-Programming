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
 
int num1,ans,n,num2,len;
 
int main(){
	scanf("%d",&n);
	while(n--){
		in num1;
		if(num1>=num2)len++;
		else len=1;
		num2=num1;
		ans=max(ans,len);
	}
	out ans;
	return 0;
}