n, m = [int(x) for x in input().split()]
arr = []

for i in range(n):
	l = list(map(int, input().strip().split(' ')))
	arr.append(l)

k = int(input())
base = []

for j in range(len(arr)):
	base.append(arr[j][k])

base.sort()
ans = []

for i in base:
	for j in arr:
		if j[k] == i and j not in ans:
			ans.append(j)
			break

for i in ans:
	print(' '.join(str(x) for x in i))