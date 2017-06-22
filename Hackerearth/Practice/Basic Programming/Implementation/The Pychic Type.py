n = int(input())
l = list(map(int, input().strip().split(' ')))
S, E = [int(x) for x in input().split()]

if S == E:
	print('Yes')
else:
	i = 0
	curr_pos = 0

	while i <= n:
		curr_pos = l[S-1]
		S = curr_pos
		#print(curr_pos)
		i+=1
		if curr_pos == E:
			break

	if i <= n:
		print('Yes')
	else:
		print('No')
