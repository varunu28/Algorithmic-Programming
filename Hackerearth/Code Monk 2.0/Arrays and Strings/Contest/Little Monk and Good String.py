vowel = ['a','e','i','o','u']
 
inp = input()
 
i = 0
m = 0
while i < len(inp):
	j = i
	s = ''
	while j < len(inp):
		if inp[j] in vowel:
			s += inp[j]
			j += 1
		else:
			if m < len(s):
				m = len(s)
			i = j 
			break
	i += 1
print(m)