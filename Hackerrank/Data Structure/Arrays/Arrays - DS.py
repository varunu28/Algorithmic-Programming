#!/bin/python3

import sys

n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
arr = arr[::-1] 
print(' '.join(str(x) for x in arr))
