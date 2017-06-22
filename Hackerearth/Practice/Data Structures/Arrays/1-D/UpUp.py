inp_str = input()
inp = list(inp_str)
if inp_str.find(' ') == -1:
	print(inp_str[0].upper() + inp_str[1:])
else:
	start = 0
	i = 0
	while i < len(inp):
		if inp[i] == ' ':
			end = i-1
			inp[start] = inp[start].upper()
			while end < len(inp):
				if inp[end+1] != ' ':
					start = end+1
					inp[start] = inp[start].upper()
					break
				else:
					end += 1
			i = end + 2
		else:
			i += 1 
	print("".join(inp))