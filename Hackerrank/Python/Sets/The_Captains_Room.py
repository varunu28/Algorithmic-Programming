n = int(input())
A = list(map(int, input().split())) 
set_A = set(A)
ans = (sum(set_A) * n - sum(A)) / (n - 1)

print(int(ans))
