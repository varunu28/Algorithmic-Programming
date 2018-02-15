#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int q;
    cin >> q;
    
    map<string, int> m;
    
    while (q--) {
        int op;
        cin >> op;
        
        if (op == 1) {
            string name;
            int marks;
            cin >> name >> marks;
            
            map<string,int>::iterator itr=m.find(name);
            
            if (itr != m.end()) {
                m[name] += marks;
            }
            else {
                m[name] = marks;
            }
        }
        else if (op == 2) {
            string name;
            cin >> name;
            m.erase(name);
        }
        else {
            string name;
            cin >> name;
            map<string,int>::iterator itr=m.find(name);
            
            if (itr == m.end()) {
                cout << 0 << endl;
            }
            else {
                cout << m[name] << endl;
            }
        }
    }
    
    return 0;
}
