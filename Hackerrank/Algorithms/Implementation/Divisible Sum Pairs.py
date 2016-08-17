#!/bin/python3

import sys


n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
a = [int(a_temp) for a_temp in input().strip().split(' ')]
i = 0
count = 0
while i < n:
    j = i+1
    while j < n:
        if i<j and (a[i]+a[j])%k==0:
            count+=1
        j+=1
    i+=1
print(count)
            
            