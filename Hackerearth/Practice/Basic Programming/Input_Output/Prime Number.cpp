#include <iostream>
#include <cmath>
using namespace std;

bool isPrime(int n) {
    if (n == 1) {
        return false;
    }
    else if (n == 2 || n==3) {
        return true;
    }
    else {
        int i = 2;
        while (i <= pow(n,0.5)) {
            if (n%i == 0) {
                return false;
            }
            i++;
        }
    }
    return true;
}

int main()
{
    int n;
    cin >> n;
    
    for (int i=1;i<=n;i++) {
        if (isPrime(i)){
            cout << i << " ";
        }
    }
    return 0;
}
