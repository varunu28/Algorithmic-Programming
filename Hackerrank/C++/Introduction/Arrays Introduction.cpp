#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int T,ar[1000];
    cin >> T;
    for(int i = 0;i < T; i++)cin >> ar[i];
    for(int i = T-1; i >=0; i--)cout << ar[i] << " ";
    return 0;
}