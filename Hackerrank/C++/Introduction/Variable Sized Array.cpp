#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,q, value;
    cin >> n >> q;
    vector<vector<int>> nvec;
    for (int i=0;i<n;i++) {
        int k;
        cin >> k;
        vector<int> ivec;
        for (int i=0;i<k;i++) {
            cin >> value;
            ivec.push_back(value);
        }
        nvec.push_back(ivec);
    }
    
    while (q--) {
        int i,j;
        cin >> i >> j;
        cout << nvec[i][j] << endl;
    }
    return 0;
}
