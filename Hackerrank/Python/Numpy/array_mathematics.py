import numpy

N, M = [int(x) for x in input().split()]

arr_N = []
arr_M = []

for i in range(N):
	arr_N.append(list(map(int, input().strip().split(' '))))

for i in range(N):
	arr_M.append(list(map(int, input().strip().split(' '))))

num_N = numpy.array(arr_N)
num_M = numpy.array(arr_M)

print(numpy.add(num_N, num_M))
print(numpy.subtract(num_N, num_M))
print(numpy.multiply(num_N, num_M))
print(numpy.divide(num_N, num_M))
print(numpy.mod(num_N, num_M))
print(numpy.power(num_N, num_M))