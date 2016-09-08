#!/bin/python3

import sys

arr = []
for arr_i in range(6):
   arr_t = [int(arr_temp) for arr_temp in input().strip().split(' ')]
   arr.append(arr_t)


max_sum=-999999

i=0
j= 0

while i<6:
   j=0
   while j<6:
      if (j+2 < 6 and i+2 < 6):
         temp_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
         if temp_sum > max_sum:
            max_sum = temp_sum
            
         #print(temp_sum)
      j+=1
   i+=1

print(max_sum)


   
