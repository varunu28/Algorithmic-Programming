#include <iostream>
using namespace std; 

// The merge function
void merge(int arr[], int start, int mid, int end)
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
void mergeSort(int arr[], int start, int end)
{
    if(start < end)
    {
        int mid = (start + end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
}

int main() {
    // Test Array
    int arr[] = {3,2,43,5,65,1,23,2,43,5,1};
    int end = sizeof(arr)/sizeof(arr[0]);
    
    mergeSort(arr,0,end-1);
    
    // Sorted Array
    for(int i=0;i<end; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}