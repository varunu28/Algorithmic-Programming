import numpy

l = list(map(float, input().strip().split(' ')))
num_l = numpy.array(l)

print(numpy.floor(num_l))
print(numpy.ceil(num_l))
print(numpy.rint(num_l))