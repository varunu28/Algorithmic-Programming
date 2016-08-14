import numpy

N, M, P = [int(x) for x in input().split()]

arr_N = []
arr_M = []

for i in range(N):
	l = list(map(int, input().strip().split(' ')))
	arr_N.append(l)

for i in range(M):
	l = list(map(int, input().strip().split(' ')))
	arr_M.append(l)

num_N = numpy.array(arr_N)
num_M = numpy.array(arr_M)

print(numpy.concatenate((num_N, num_M), axis = 1))   