#include <bits/stdc++.h>
 
using namespace std;
void merge(long long arr[], int start, int mid, int end)
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
void mergeSort(long long arr[], int start, int end)
{
    if(start < end)
    {
        int mid = (start + end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
}
 
int binarySearch(long long a[],int start, int end, long long num)
{
    if(end >= start)
    {
        int mid = start + (end - start)/2;
        
        if(a[mid] == num)
        {
            return mid;
        }
        else if(a[mid] < num)
        {
            return binarySearch(a, mid+1, end, num);
        }
        else
        {
            return binarySearch(a, start, mid-1, num);
        }
    }
    else
    {
        return -1;
    }
}
 
 
int main()
{
    int n,q;
    cin >> n >> q;
    long long a[n];
    
    for(int i = 0;i<n;i++)
    {
    	cin >> a[i];
    }
    
    int l = sizeof(a)/sizeof(a[0]);
    
    mergeSort(a,0,l-1);
    
    long long t;
    
    while(q--)
    {
    	cin >> t;
    	if(binarySearch(a,0,l-1,t)==-1)
    		cout << "NO\n";
    	else
    		cout << "YES\n";
    }
    return 0;
}