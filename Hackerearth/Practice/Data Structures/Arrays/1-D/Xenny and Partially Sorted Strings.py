t = int(input())

while t != 0:
	items= [x for x in input().split(' ')]
	n,k,m = int(items[0]),int(items[1]),int(items[2])
	arr = list()
	while n != 0:
		arr.append(input())
		n -= 1
	for i in arr:
		i = ''.join(sorted(i[0:m])) + i[m:]
	
	new_arr = sorted(arr)
	print(new_arr[k-1])
	t -= 1
		