import numpy

l = list(map(int, input().strip().split(' ')))

num_zero = numpy.zeros(tuple(l), dtype=int)
num_one = numpy.ones(tuple(l), dtype=int)
print(num_zero)
print(num_one)