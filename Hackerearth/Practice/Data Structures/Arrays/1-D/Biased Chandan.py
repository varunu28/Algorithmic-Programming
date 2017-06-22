n = int(input())
arr = list()
i = 0
while i < n:
	i += 1
	k = int(input())
	arr.append(k)
	
i = 0
#print(arr)
 
while True:
	if arr[i] == 0:
		if i == 0:
			del arr[i]
			i -= 1
		else:
			del arr [i]
			del arr[i-1]
			i -= 2
	i += 1
	if i == len(arr):
		break
	
#print(arr)
sum_all = 0
i = 0
while i < len(arr):
	sum_all += arr [i]
	i += 1
 
print(sum_all)