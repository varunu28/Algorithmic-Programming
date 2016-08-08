from itertools import combinations_with_replacement

str_inp, length = ((i) for i in input().split())

int_len = int(length)
str_arr = list(str_inp)
str_arr.sort()
ans = []

for i in list(combinations_with_replacement(str_arr, int_len)):
	ans.append(''.join(i))

for i in ans:
	print(i)