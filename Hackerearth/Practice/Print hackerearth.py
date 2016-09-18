n = int(input())
inp = input()

main_str = 'hackerearth'

main_d = dict()
count_d = dict()

for i in main_str:
	if i in main_d:
		main_d[i] += 1
	else:
		main_d[i] = 1

for i in inp:
	if i in count_d:
		count_d[i] += 1
	else:
		count_d[i] = 1

ans = []

for i in count_d:
	if i in main_d:
		temp = int(count_d[i]/main_d[i])
		ans.append(temp)

print(min(ans))
