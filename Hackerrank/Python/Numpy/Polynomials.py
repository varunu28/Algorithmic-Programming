import numpy

P = numpy.array(list(map(float, input().strip().split(' '))))
x = float(input())

print(numpy.polyval(P, x))