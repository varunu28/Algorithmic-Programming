import numpy

l = list(map(int, input().strip().split(' ')))
print(numpy.eye(l[0], l[1]))