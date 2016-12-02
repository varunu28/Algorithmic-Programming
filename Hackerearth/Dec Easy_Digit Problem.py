# Digit Problem
'''
Problem Description: This time your task is simple.

Given two integers X and K, find the largest number that can be formed by changing digits at atmost K places in the number X.

Input:

First line of the input contains two integers X and K separated by a single space.

Output:

Print the largest number formed in a single line.

Constraints:

    1≤X≤1018
    0≤K≤9
'''

a,b = (int(i) for i in input().split())
a_str = list(str(a))
i = 0
c = 0
while i < b and c < len(a_str):
	if a_str[c] != '9':
		a_str[c] = '9'
		i += 1
	c += 1
num_str = ''.join(a_str)
print(int(num_str))
