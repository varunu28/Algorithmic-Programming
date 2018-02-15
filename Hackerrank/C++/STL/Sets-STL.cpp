#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    set<int> s;
    int n;
    cin >> n;
    
    while (n--) {
        int op;
        int val;
        cin >> op >> val;
        
        if (op == 1) {
            s.insert(val);
        }
        else if (op == 2) {
            s.erase(val);
        }
        else {
            set<int>::iterator itr=s.find(val);
            cout << (itr == s.end() ? "No" : "Yes") << endl;
        }
    }
    return 0;
}
