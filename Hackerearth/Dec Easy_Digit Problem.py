a,b = (int(i) for i in input().split())
a_str = list(str(a))
i = 0
c = 0
while i < b and c < len(a_str):
	if a_str[c] != '9':
		a_str[c] = '9'
		i += 1
	c += 1
num_str = ''.join(a_str)
print(int(num_str))
