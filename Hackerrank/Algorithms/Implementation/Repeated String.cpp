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
    string s;
    cin >> s;
    unsigned long long n;
    cin >> n;
    
    if(s.length() == 1)
    {
        if(s[0] == 'a')
        {
            cout << n;    
        }
        else
        {
           cout << 0;    
        }
    }
    else
    {
        
        int count = 0;
        for(int i=0;i<s.length();i++)
            {
            if(s[i]=='a')
                {
                count++;
            }
        }
        if(n%s.length() == 0)
            {
            
            cout << (n/s.length())*count;
            }
        else
            {
            unsigned long long tot = (n/s.length())*count;
            for(int i=0;i<(n%s.length());i++)
                {
                if(s[i] == 'a')
                    {
                    tot++;
                }
            }
            cout << tot;
        }
    }
    
    return 0;
}
