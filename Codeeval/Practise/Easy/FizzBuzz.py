import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
	X, Y, N = [int(x) for x in test.split()]
	ans = []

	for i in range(1, N+1):
		if i%X == 0 and i%Y == 0:
			ans.append('FB')
		elif i%X == 0:
			ans.append('F')
		elif i%Y == 0:
			ans.append('B')
		else:
			ans.append(str(i))

	print(' '.join(ans))