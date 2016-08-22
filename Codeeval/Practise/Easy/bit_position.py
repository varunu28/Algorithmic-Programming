import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        n, p1, p2 = [int(num) for num in test.split(',')]
        if bin(n)[-p1] == bin(n)[-p2]:
            print('true')
        else:
            print('false')
            