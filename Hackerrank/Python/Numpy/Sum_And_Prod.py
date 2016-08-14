import numpy

N, M = [int(x) for x in input().split()]

arr = []

for i in range(N):
	arr.append(list(map(int, input().strip().split(' '))))

num_arr = numpy.array(arr)

print(numpy.prod(numpy.sum(num_arr, axis=0)))
