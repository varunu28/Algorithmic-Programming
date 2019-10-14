#include <bits/stdc++.h>
#define ll long long int
#define pb push_back
#define mp make_pair
#define mod 1000000007
#define pi 3.141592653589793
using namespace std;



int main() {
//    cout << setprecision(10);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);


    int n;
    string s;
    cin >> n >> s;
    string ss;
    for (char c : s) {
        if (!ss.empty() && ss.back() == '(' && c == ')') ss.pop_back();
        else ss += c;
    }

    cout << (ss.empty() || ss == ")(" ? "Yes" : "No");
}
