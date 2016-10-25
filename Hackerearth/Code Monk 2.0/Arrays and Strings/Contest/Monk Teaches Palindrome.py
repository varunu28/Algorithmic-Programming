t = int(input())
while t > 0:
	t -= 1
	inp = input()
	if inp == inp[::-1]:
		if len(inp)%2 == 0:
			print("YES EVEN")
		else:
			print("YES ODD")
	else:
		print("NO")