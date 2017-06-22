t = int(input())

while t != 0:
	arr = list()
	t -= 1
	n,m = [int(x) for x in input().split()]
	for j in range(n):
		arr.append(input().strip())

	valid = True
	arr.sort()
	
	for i in range(n-1):
		if arr[i] == arr[i+1]:
			valid = False
			break
	if valid:
		print('Yes')
	else:
		print('No')