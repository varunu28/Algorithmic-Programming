from itertools import product
l = map(int, input().strip().split(' '))
A = []
for p in l:
    A.append(p)

l = map(int, input().strip().split(' '))
B = []
for p in l:
    B.append(p)

temp = list(product(A, B))
ans = ''

for x in temp:
    ans = ans + str(x) + ' '

print(ans)
