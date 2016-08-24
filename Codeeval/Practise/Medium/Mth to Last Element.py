import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        text, num = test.split()[:-1], int(test.split()[-1])
        try:
            print(text[-num])
        except IndexError:
            pass