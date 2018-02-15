#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    
    int n;
    cin >> n;
    
    vector<int> vect(n);
    
    for (int i=0;i<n;i++) {
        cin >> vect[i];
    }
    
    int x;
    cin >> x;
    
    vect.erase(vect.begin()+x-1);
    
    int a;
    int b;
    
    cin >> a >> b;
    
    vect.erase(vect.begin()+a-1, vect.begin()+b-1);
    
    cout << vect.size() << endl;
    
    for (int i=0;i<vect.size();i++) {
        cout << vect[i] << " ";
    }
    
    return 0;
}
