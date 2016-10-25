t = int(input())
 
while t > 0:
	t -= 1
	a, b = (int(i) for i in input().split())
	l = list(map(int, input().strip().split(' ')))
	if b == a:
		print(' '.join(str(x) for x in l))
	else:
		if b > a:
			b = b - a*int(b/a)
		while b > 0:
			l = l[-1:]+l[:-1]
			b -= 1
			
		print(' '.join(str(x) for x in l))