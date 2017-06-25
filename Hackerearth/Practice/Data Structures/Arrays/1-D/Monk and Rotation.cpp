#include <iostream>
using namespace std;
 
int main()
{
    int t;
    long long n,k;
    cin >> t;

    while (t--) {
        cin >> n >> k;
        long long rot = k%n;
        long long a[1000000];
        for (int i = 0; i < n; ++i)
        {
            cin >> a[j];
            rot = (rot+1)%n;
        }
        for (int i = 0; i < n; ++i)
        {
            cout << a[i] << " ";
        }
        cout << endl;
    }
    return 0;
}