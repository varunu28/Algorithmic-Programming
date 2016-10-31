def selection_sort(a,x):
	i = 0
	while i < len(a):
		j = i  
		min_idx = j
		while j < len(a):
			if a[j] < a[min_idx]:
				min_idx = j
			j += 1
		a[i],a[min_idx] = a[min_idx], a[i]
		i += 1
		x -= 1
		if x == 0:
			break
	return a
 
# Test Case
 
n, x = (int(i) for i in input().split())
a = list(map(int, input().strip().split(' ')))
print(' '.join(str(x) for x in selection_sort(a,x)))