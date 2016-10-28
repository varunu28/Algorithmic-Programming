#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int n,count=0;
    cin >> n;
    int c[n];
    for(int c_i = 0;c_i < n;c_i++){
       cin >> c[c_i];
    }
    sort(c,c+n);
    
    for(int c_i = 0;c_i < n;c_i++)
    {
        if(c[c_i] == c[c_i + 1])
        {
           count ++;
           c_i++;
        }
    }
    cout << count << endl;
    return 0;
}
