import numpy

N = int(input())
A = list()
B = list()

for i in range(N):
	l = list(map(int, input().strip().split(' ')))
	A.append(l)

for i in range(N):
	l = list(map(int, input().strip().split(' ')))
	B.append(l)

num_A = numpy.array(A)
num_B = numpy.array(B)

print(numpy.dot(num_A, num_B))