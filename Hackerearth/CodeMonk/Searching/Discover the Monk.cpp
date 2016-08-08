#include <bits/stdc++.h>
#include <algorithm>
#include<string>
using namespace std;

int binary_search(unsigned long long A[], int left, unsigned long long right, unsigned long long item)
{
    //cout<<"Inside the function"<<endl;
    //cout<<item<<"\n";
    if(left<=right)
    {
        unsigned long long mid = left + (right-left)/2;
        if(A[mid] == item)
        {
            return 1;
        }
        else if(A[mid] < item)
        {
            return binary_search(A, mid+1, right, item);
        }
        else if(A[mid] > item)
        {
            return binary_search(A, left, mid-1, item);
        }
    }
    else
    {
        return -1;
    }
}

int main()
{
    unsigned long long N, Q, i=0;
    cin >> N >> Q;
    unsigned long long A[N];
    //cout<<Q<<"\n";
    while(i<N)
    {
        //cout<<i<<"\n";
        cin >> A[i];
        i++;
    }

    sort(A,A + sizeof A / sizeof A[0]);

    unsigned long long j = 0;
    int left;
    unsigned long long right;
    unsigned long long X;

    while(j<Q)
    {
        left = 0;
        right =  sizeof(A)/sizeof(A[0]);
        //cout<<"Inside Major while"<<endl;
        cin>>X;
        //cout<<X<<"\n";
        if(binary_search(A, left, right, X) == 1)
        {
            cout<<"YES"<<"\n";
        }
        else
        {
            cout<<"NO"<<"\n";
        }
        j++;
    }
    return 0;
}
