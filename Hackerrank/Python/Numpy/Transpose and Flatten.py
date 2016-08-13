import numpy

N, M = [int(x) for x in input().split()]
arr = []

for i in range(N):
	l = list(map(int, input().strip().split(' ')))
	arr.append(l)

num_arr = numpy.array(arr)

print(numpy.transpose(num_arr))
print(num_arr.flatten())


