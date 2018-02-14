#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    
    int n,q;
    cin >> n >> q;
    
    vector<vector<int>> arr(n);
    
    for (int i=0;i<n;i++) {
        int k;
        cin >> k;
        vector<int> temp(k);
        for (int j=0;j<k;j++) {
            int t;
            cin >> temp[j];
        }
        
        arr[i] = temp;
    }
    
    int id1, id2;
    
    for (int i=0;i<q;i++) {
        cin >> id1 >> id2;
        cout << arr[id1][id2] << endl;
    }
    return 0;
}
