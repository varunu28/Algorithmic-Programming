n = int(input())
arr = ['0','1','2','3','4','5','6','7','8','9']
fav = 0
aga = 0
 
while n>0:
	n -= 1
	s = input()
	for i in range(len(s)-1):
		if s[i] in arr:
			if s[i+1] in arr:
				if int(s[i] + s[i+1]) == 19 or int(s[i] + s[i+1]) == 20:
					if s[0] == 'G':
						aga += 2
					else:
						aga += 1
				else:
					if s[0] == 'G':
						fav += 2
					else:
						fav += 1
				i += 1
if fav >= aga:
    print('No Date')
else:
    print('Date')
 
 
 