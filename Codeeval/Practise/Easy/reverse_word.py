import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        print(' '.join(test.strip().split(' ')[::-1]))
   
print(' ')