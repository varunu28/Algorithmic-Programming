import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        n = int(test)
        print(str(bin(n)).count('1'))