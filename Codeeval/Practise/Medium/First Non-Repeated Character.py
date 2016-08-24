import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        inp_list = list(test)
        for i in inp_list:
        	if inp_list.count(i) == 1:
        		print(i)
        		break
