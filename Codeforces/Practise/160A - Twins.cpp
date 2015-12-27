#include <bits/stdc++.h>
#include <ctype.h>
#define in cin>>
#define out cout<<
#define M 100002
#define FOR(l)   for(int k=0; k<l; k++)
#define Si set<int>
#define Mii map<int,int>
#define Mss map<string,string>
#define Vi vector<int>
#define Di deque<int>
#define max(a,b) ( (a) > (b) ? (a) : (b))
#define miN(a,b) ( (a) < (b) ? (a) : (b))


using namespace std;

int main()
{
    int n;
    in n;
    
    int a[n];
    int temp_sum=0;
    
    for(int i=0;i<n;i++) //Getting Input and getting the sum of all elements
    {
        in a[i];
        temp_sum+=a[i];
    }
    
    sort(a, a+n); //Sorting the array and reversing the array
    
    int a_rev[n];
    int j=0;
    
    for(int i=n-1;i>=0;i--)
    {
        a_rev[j]=a[i];
        j++;
    }
  
    int sum=0;
    int count=0;
    
    for(int i=0;i<n;i++) //Picking the coins and checking the sum
    {
        sum+=a_rev[i];
        count++;
        
        if(sum>temp_sum/2)
        {
            break;
        }
    }
    
    out count;
    return 0;
}