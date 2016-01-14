#include <cstdio>
#include <iostream>
 
using namespace std;
 
int main ()
{
    int n;
    int m;
    int a;
 
    scanf ("%d %d %d", &n, &m, &a);
 
    long long flagsByRow = n / a;
 
    if (n % a) flagsByRow++;
 
    long long flagsByColumn = m / a;
 
    if (m % a) flagsByColumn++;
 
    cout << flagsByRow * flagsByColumn << endl;
 
    return 0;
}