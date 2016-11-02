#include <iostream>
using namespace std;

// Ternary Search Function
int ternary_search(int a[],int start, int end, int num)
{
    if(end >= start)
    {
        int mid1 = start + (end - start)/3;
        int mid2 = end - (end - start)/3;
        
        if(a[mid1] == num)
            return mid1;
        if(a[mid2] == num)
            return mid2;
        if(num < a[mid1])
        {
            return ternary_search(a,start,mid1-1,num);
        }
        else if(num > a[mid2])
        {
            return ternary_search(a,mid2+1,end,num);
        }
        else
        {
            return ternary_search(a,mid1+1,mid2-1,num);
        }
    }
    else
    {
        return -1;
    }
}

int main() {
    // Test Array
    int a[] = {1,3,23,34,56,76,87,98,102};
    int num = 76;
    int l = sizeof(a)/sizeof(a[0]);
    
    // Output
    if(ternary_search(a, 0, l-1, num) == -1)
    {
        cout << num << " is not present in array.\n";
    }
    else
    {
        cout << num << " is present at index: " << ternary_search(a, 0, l-1, num);
    }
    return 0;
}