from collections import defaultdict

n, m = list(map(int, input().split()))
A = defaultdict(list)
B = defaultdict(list)

for i in range(n):
    temp = input()
    A[temp].append(i+1)

for j in range(m):
    temp = input()
    if temp in A:
        print(' '.join(str(x) for x in A[temp]))
    else:
        print(-1)
