A = set(map(int, input().split())) 
ans = True
n = int(input())

for i in range(n):
    temp = set(map(int, input().split())) 
    if not temp.issubset(A):
        ans = False
    if len(temp) >= len(A):
        ans = False
print(ans) 
