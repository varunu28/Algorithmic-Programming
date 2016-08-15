import numpy

N = int(input())
A = list()

for i in range(N):
	l = list(map(float, input().strip().split(' ')))
	A.append(l)

num_A = numpy.array(A)

print(numpy.linalg.det(num_A))