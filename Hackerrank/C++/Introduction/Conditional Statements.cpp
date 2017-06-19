#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    string num[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int n;
    cin >> n;
    if (n>=1 && n<=9) {
        cout << num[n-1];
    }
    else {
        cout << "Greater than 9";
    }
   return 0;
}
