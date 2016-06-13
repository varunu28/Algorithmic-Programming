N = int(input())

w = len('{:b}'.format(N))

for i in range(1, N+1):
    print(str.rjust(str(i), w),\
        str.rjust('{:o}'.format(i), w),\
        str.rjust('{:X}'.format(i), w),\
        str.rjust('{:b}'.format(i), w))
