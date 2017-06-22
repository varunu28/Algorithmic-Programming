t = int(input())
while t != 0:
	t -= 1
	inp = input()
	arr = inp.split()
	front = int(len(arr)/2) - 1
	back = len(arr) - 1
	i = 0
	while i <= front:
		temp = arr[i]
		arr[i] = arr[back]
		arr[back] = temp
		i += 1
		back -= 1
	print(" ".join(arr))