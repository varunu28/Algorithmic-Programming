n = int(input())
s = set(map(int, input().split()))
N = int(input())
i = 0
while i < N:
    l = input().split()
    if len(l) == 1:
        if l[0] == 'pop':
            s.pop()
    else:
        if l[0] == 'remove':
            s.remove(int(l[1]))
        else:
            s.discard(int(l[1]))
    i += 1
sum = 0
for j in s:
    sum += j

print(sum)
