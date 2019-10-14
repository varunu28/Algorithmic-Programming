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


    int n, k;
    cin >> n >> k;
    int a[n + 1], b[n + 1], ind[n + 1];
    for (int i = 1; i < n + 1; i++) cin >> a[i];
    for (int i = 1; i < n + 1; i++) {
        cin >> b[i];
        ind[b[i]] = i;
    }

    int freq[n + 1];
    memset(freq, 0, sizeof freq);
    int un = 0;
    vector<int> pts;

    for (int i = n; i; i--) {
        if (a[i] != b[i]) {
            freq[a[i]]++;
            freq[b[i]]++;
            freq[a[i]] == 1 ? un++ : un--;
            freq[b[i]] == 1 ? un++ : un--;
        }
        if (un == 0) pts.pb(i - 1);
    }

    if (pts.size() < k) cout << "NO";

    else {
        string s = string(n, 'A');
        char c = 'z';
        int i = 0;
        for (int j = n - 1; j >= 0; j--) {
            s[a[j + 1] - 1] = c;
            s[b[j + 1] - 1] = c;
            if (j == pts[i]) {
                i++;
                if (c > 'a') c--;
            }
        }

        cout << "YES\n" << s;
    }



}
 
