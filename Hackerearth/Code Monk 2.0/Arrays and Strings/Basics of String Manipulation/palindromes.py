inp = input()
i = 0
if inp == inp[0]*len(inp):
	print(0)
else:
	valid = False
	while i < int(len(inp)/2):
		j = len(inp) - 1
		while j >= 0:
			if inp[i:j+1] != inp[i:j+1][::-1]:
				ans = len(inp[i:j+1])
				valid = True
				break
			j -= 1 
		if valid:
			break
		i += 1 
	print(ans)
		
		