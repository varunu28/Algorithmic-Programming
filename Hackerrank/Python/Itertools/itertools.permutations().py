from itertools import permutations

str_inp, length = ((i) for i in input().split())

int_len = int(length)
str_arr = list(str_inp)
ans = []

for i in list(permutations(str_arr, int_len)):
	ans.append(''.join(i))

ans.sort()

for i in ans:
	print(i)