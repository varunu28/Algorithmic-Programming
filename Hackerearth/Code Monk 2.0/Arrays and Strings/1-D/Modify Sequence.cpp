#include <iostream>
#include<math.h>
using namespace std;
 
int main()
{
    int n;
    cin >> n;
    unsigned long long e_sum,o_sum,k;
    e_sum=o_sum=0;
   	
   	for(int i=0;i<n;i++)
   	{
   		cin >> k;
   		if(i%2==0)
   		{
   			e_sum += k;
   		}
   		else
   		{
   			o_sum += k;
   		}
   	}
   	
   	if((e_sum-o_sum)%11 == 0)
   	{
   		cout << "YES";
   	}
   	else
   	{
   		cout << "NO";
   	}
    return 0;
}