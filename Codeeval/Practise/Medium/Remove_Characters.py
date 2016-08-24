import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        test = test.strip()
        if len(test) == 0:
            continue
        words = test.split(',')[0].strip()
        chars = test.split(',')[1].strip()
        for c in chars:
            words = words.replace(c, '')
        print(words)
