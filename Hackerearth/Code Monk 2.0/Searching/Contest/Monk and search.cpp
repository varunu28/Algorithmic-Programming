#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
#define fastScan ios_base::sync_with_stdio(0); cin.tie(NULL);
#define rep(i,n) for(ll i=0; i<(n); i++)
#define repp(i,ed,b) for(ll i=ed; i<=(b); i++)
#define repp2(i,b,ed) for(ll i=b; i>=(ed); i--)
#define io ios_base::sync_with_stdio(false); 
#define sc(n) scanf("%lld",&n);

void merge(ull arr[], ull start, ull mid, ull end)
{
    int n1 = mid - start + 1;
    int n2 = end - mid;
    int L[n1],R[n2];
    
    for(int i=0;i < n1; i++)
    {
        L[i] = arr[start + i];
    }
    
    for(int i=0;i < n2; i++)
    {
        R[i] = arr[mid + 1 + i];
    }
    
    int i,j,l;
    i=j=0;
    l = start;
    
    while(i<n1 && j<n2)
    {
        if(L[i]<=R[j])
        {
            arr[l] = L[i];
            i++;
        }
        else
        {
            arr[l] = R[j];
            j++;
        }
        l++;
    }
    
    while(i<n1)
    {
        arr[l] = L[i];
        i++;
        l++;
    }
    
    while(j<n2)
    {
        arr[l] = R[j];
        j++;
        l++;
    }
}

// The mergeSort function
void mergeSort(ull arr[], ull start, ull end)
{
    if(start < end)
    {
        int mid = (start + end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
}

int main()
{
	io 
	ull n;
	cin >> n;
	ull a[n];

	for(ull i=0;i<n;i++)
	{
		cin >> a[i];
	}

	ull l = sizeof(a)/sizeof(a[0]);

	mergeSort(a,0,l);

	ull q,q_n,k,count;
	cin >> q;

	while(q--)
	{
		cin >> q_n >> k;
		count = 0;
		if(a[l-1] < k)
		{
			cout << count << endl;
		}
		else
		{
			for(ull i=n-1;i>=0;i--)
			{
				if(q_n==0)
				{
					if(a[i] >= k)
					{
						count++;
					}
					else
						break;
				}
				else
				{
					if(a[i] > k)
					{
						count++;
					}
					else
						break;
				}
			}
			cout << count << endl;
		}
	}
	return 0;
}
