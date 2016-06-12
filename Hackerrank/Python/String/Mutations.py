#!/usr/bin/env python3
line = input()
list1 = input()
list1 = list1.split()
indx = int(list1[0])
word = list1[1]
print(line[:indx] + word + line[indx+1:])
