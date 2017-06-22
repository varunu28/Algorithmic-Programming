n = int(input())
pile = list()
 
for i in range(1000000):
    pile.append(i)
 
top = -1
 
while n>0:
	n -= 1
	l = list(map(int, input().strip().split(' ')))
	if len(l) == 1:
		if top == -1:
			print('No Food')
		else:
			print(pile[top])
			top -= 1
	else:
		top += 1
		pile[top] = l[1]