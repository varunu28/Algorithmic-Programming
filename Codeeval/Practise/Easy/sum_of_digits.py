import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        sum = 0
        n = int(test)
        while n > 0:
        	sum += n%10
        	n = int(n/10)
        print(sum)