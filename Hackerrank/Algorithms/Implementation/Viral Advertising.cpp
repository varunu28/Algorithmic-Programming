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
    long long sum = 0;
    long long a = 2;
    n--;
    
    while(n>=0)
    {
       sum += a;
       a = (a*3)/2;
       n--;
    }
    
    cout << sum;
    return 0;
}
