import numpy

N, M = [int(x) for x in input().split()]
arr = []

for i in range(N):
	l = list(map(int, input().strip().split(' ')))
	arr.append(l)

num_arr = numpy.array(arr)

print(numpy.mean(num_arr, axis=1))
print(numpy.var(num_arr, axis=0))
print(numpy.std(num_arr, axis=None))