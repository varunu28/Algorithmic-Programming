import sys
from math import sqrt

test_cases = open(sys.argv[1], 'r')

for test in test_cases:
    n = int(test.rstrip())
    print(int(((1+sqrt(5))**n-(1-sqrt(5))**n)/(2**n*sqrt(5))))
test_cases.close()