n = int(input())
inp = list()
while n != 0:
	s = input()
	inp.append(s)
	n -= 1
ans = list()

for i in inp:
	found = False
	if len(ans) != 0:
		for j in ans:
			for k in j:
				if sorted(i) == sorted(k) and i[0] == k[0] and i[len(i)-1] == k[len(k)-1]: 
					found = True
					break
				else:
					if len(i) == len(k):
						if i[0] == k[0] and i[len(i)-1] == k[len(k)-1]:
							if sorted(i) == sorted(k):
								j.append(i)
								found = True
			if found:
				break
	if found == False:
		temp = list()
		temp.append(i)
		ans.append(temp)
	
print(len(ans))
			
					