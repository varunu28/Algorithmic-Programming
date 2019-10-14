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
    cin >> n;
    int c[n + 1], a[n + 1], par[n + 1];
    vector<int> parents;
    vector<int> ed[n + 1];
    memset(par, -1, sizeof par);
    for (int i = 0; i < n; i++) cin >> c[i + 1];
    for (int i = 0; i < n; i++) {
        cin >> a[i + 1];
        if (i + 1 == a[i + 1]) {
            parents.pb(i + 1);
        }

        else {
            ed[a[i + 1]].pb(i + 1);
        }
    }

    ll ans = 0;
    bool vis[n + 1];
    memset(vis, false, sizeof vis);

    for (int e : parents) {
        ans += c[e];
        queue<int> q;
        q.push(e);

        while (!q.empty()) {
            int f = q.front();
            q.pop();
            vis[f] = true;
            for (int child : ed[f]) {
                q.push(child);
            }
        }
    }


    unordered_set<int> cycles;

    for (int i = 1; i <= n; i++) {
        map<int, bool> d;
        int j = i;
        while (!vis[j]) {
            vis[j] = true;
            d[j] = true;
            j = a[j];
        }

        if (d[j]) {
            cycles.insert(j);
        }
    }

//    for (int e : cycles) cout << e << ' ';

//    for (int i = 1; i <= n; i++) cout << vis[i] << ' ';

    memset(vis, false, sizeof vis);
    for (int e : cycles) {
        int here = INT_MAX;
        int j = e;
        while (!vis[j]) {
            vis[j] = true;
            here = min(here, c[j]);
            j = a[j];
        }
        ans += here;
    }

    cout << ans;
}
 
