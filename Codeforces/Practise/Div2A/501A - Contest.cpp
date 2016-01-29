#include <bits/stdc++.h>
#define in cin>>
#define out cout<<
#define ll long long
#define ull unsigned long long
#define FOR(l)   for(int k=0; k<l; k++)
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define min(a,b) ( (a) < (b) ? (a) : (b))

using namespace std;

int main(){
	double a, b, c, d, x, y;
    cin >> a >> b >> c >> d;
    x = max(3 * a / 10, a - a * c / 250);
    y = max(3 * b / 10, b - b * d / 250);
    if(a == b && x == y) 
    {
        cout << "Tie" << endl;
    }
    
    else if(x > y) 
    {
        cout << "Misha" << endl;
    }
    
    else if(x < y) 
    {
        cout << "Vasya" << endl;
    }
    else 
    {
        cout << "Tie" << endl;
    }
	return 0;
}
