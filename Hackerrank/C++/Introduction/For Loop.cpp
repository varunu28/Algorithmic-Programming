#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int low,up;
    cin >> low >> up;
    string num[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    for (int n=low; n<=up;n++) {
        if (n>=1 && n<=9) {
            cout << num[n-1] << endl;
        }
        else {
            if (n%2 == 0) {
                cout << "even" << endl;
            }
            else {
                cout << "odd" << endl;
            }
        }
    }
    return 0;
}
