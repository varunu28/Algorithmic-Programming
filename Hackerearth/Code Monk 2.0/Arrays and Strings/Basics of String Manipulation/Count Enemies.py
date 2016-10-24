t = int(input())
while t > 0:
	t -= 1
	inp = input().split()
	enemies = inp.count('O')
	i = 0
	while i < len(inp):
		if inp[i] == "X":
			i += 1
			while True:
				if inp[i] == "O":
					inp[i] = "N"
				elif inp[i] == "*":
					break
				i += 1
		else:
			i += 1
	print(inp.count("O"))
