#include <bits/stdc++.h>
#define ll long long int
#define pb push_back
#define mp make_pair
#define mod 1000000007
#define pi 3.141592653589793
using namespace std;


void f() {
    int n;
    string s;
    cin >> n >> s;

    for (char j = '0'; j <= '9'; j++) {
        string ans = string(n, '@');
        char l1 = '0', l2 = j + 1;
        int last = -1, fir = n;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] < j && s[i] >= l1) {
                l1 = s[i];
                ans[i] = '1';
                cnt++;
                last = i;
            }

            else if (s[i] > j && s[i] >= l2) {
                l2 = s[i];
                ans[i] = '2';
                cnt++;
                fir = (fir == n ? i : fir);
            }
        }

        if (cnt + count(s.begin(), s.end(), j) == n) {
            for (int i = last + 1; i < n; i++) {
                if (s[i] == j) ans[i] = '1';
            }

            for (int i = 0; i < n; i++) {
                if (ans[i] == '@') ans[i] = '2';
            }

            vector<char> just;
            for (int i = 0; i < n; i++) {
                if (ans[i] == '1') just.pb(s[i]);
            }

            for (int i = 0; i < n; i++) {
                if (ans[i] == '2') just.pb(s[i]);
            }

            bool cs = true;
            for (int i = 1; i < n; i++) {
                if (just[i] < just[i - 1]) {
                    cs = false;
                    break;
                }
            }

            if (cs) {
                cout << ans;
                return;
            }

        }
    }

    cout << '-';

}

int main() {
//    cout << setprecision(10);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);



    int t;
    cin >> t;
    while (t--) {
        f();
        cout << '\n';
    }


}
