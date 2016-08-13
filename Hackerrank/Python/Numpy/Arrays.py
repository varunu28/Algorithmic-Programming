import numpy
l = list(map(float, input().strip().split(' ')))
l = l[::-1]

l_numpy = numpy.array(l, float)
print(l_numpy)