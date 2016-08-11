n = int(input())
A = set(map(int, input().split()))

N = int(input())

for i in range(N):
    s = input().split()
    temp = set(map(int, input().split()))
    if s[0] == 'intersection_update':
        A.intersection_update(temp)
    elif s[0] == 'update':
        A.update(temp)
    elif s[0] == 'symmetric_difference_update':
        A.symmetric_difference_update(temp)
    elif s[0] == 'difference_update':
        A.difference_update(temp)

print(sum(A))
