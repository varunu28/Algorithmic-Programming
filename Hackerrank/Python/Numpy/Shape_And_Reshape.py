import numpy

l = list(map(int, input().strip().split(' ')))
num_l = numpy.array(l)
num_l.shape = (3,3)
print(num_l)