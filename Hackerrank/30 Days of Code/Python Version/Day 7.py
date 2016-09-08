#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

rev_arr = arr[::-1]

str1 = ' '.join(str(e) for e in rev_arr)

print(str1)
