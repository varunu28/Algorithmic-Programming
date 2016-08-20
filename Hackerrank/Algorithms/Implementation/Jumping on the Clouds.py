#!/bin/python3

import sys


n = int(input().strip())
c = [int(c_temp) for c_temp in input().strip().split(' ')]

i = 0
count = 0

while i < n:
    if i+2 < n and c[i+2]==1:
        i = i+1
        count += 1
    else:
        i = i+2
        count += 1

    if i == n-1:
        break
        
print(count)
        