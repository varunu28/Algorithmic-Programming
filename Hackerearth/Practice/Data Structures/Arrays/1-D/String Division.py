
n = int(input())

while n != 0:
	inp = input()
	length = len(inp)
	arr = []
	for i in inp:
		if i not in arr:
			arr.append(i)
	unique = len(arr)
	if length < 4:
		print('NO')
	elif unique == 1 and length >= 10:
		print('YES')
	elif unique == 2:
		if length >=7:
			print('YES')
		elif length == 6:
			if inp.count(arr[0])*inp.count(arr[1]) > 5:
				print('YES')
			else:
				print('NO')
		else:
			print('NO')
	elif unique == 3 and length >=5:
		print('YES')
	elif unique >= 4:
		print('YES')
	else:
		print('NO')

	n -= 1

			
		

