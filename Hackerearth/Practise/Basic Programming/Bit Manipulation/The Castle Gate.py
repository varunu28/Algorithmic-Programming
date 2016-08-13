t = int(input())
while t:
	t-=1
	n=int(input())
	count = 0
	i = 1
	for i in range(1, n+1):
		for j in range(i+1, n+1):
			if i^j <n or i^j==n:
				count+=1
			#print(i, j, i^j)
	print(count)