l = int(input())
n = int(input())

while n > 0:
	n-=1
	s = input()
	s = s.split()
	items = []
	items.append(int(s[0]))
	items.append(int(s[1]))
	if items[0] < l or items[1] < l:
		print("UPLOAD ANOTHER")
	else:
		if items[0] == items[1]:
			print("ACCEPTED")
		else:
			print("CROP IT")
