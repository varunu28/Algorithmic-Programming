#include <iostream>
#include <string>
using namespace std;

int main() {
   // Complete the program
    string a,b;
    cin >> a >> b;
    
    cout << a.length() << " " << b.length() << endl;
    cout << a << b << endl;
    string a_ = b[0] + a.substr(1,a.length());
    string b_ = a[0] + b.substr(1,b.length());
    
    cout << a_ << " " << b_ << endl;
    return 0;
}
