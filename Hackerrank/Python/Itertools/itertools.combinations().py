from itertools import combinations

str_inp, length = ((i) for i in input().split())

int_len = int(length)
str_arr = list(str_inp)
str_arr.sort()
ans = []

i = 1

while i <= int_len:
	temp = list(combinations(str_arr, i))
	for j in temp:
		ans.append(''.join(j))
	i += 1

for item in ans:
	print(item)