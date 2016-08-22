import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        x, n = list(map(int, test.split(',')))
        if x%n == 0:
        	print(int(x/n)*n)
        else:
        	print((int(x/n) + 1)*n)


        