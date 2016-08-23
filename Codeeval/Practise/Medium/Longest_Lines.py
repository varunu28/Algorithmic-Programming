import sys

k = 0
test_d = dict()
with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        if k == 0:
            n = int(test)
        else:
        	test_d[test] = len(test)
        k += 1
        
    sort_d = sorted(test_d.items(), key=lambda x: x[1], reverse=True)
    
    for i,j in sort_d:
    	print(i)
    	n -= 1
    	if n == 0:
    		break
        