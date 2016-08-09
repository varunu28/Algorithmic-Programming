from collections import Counter

X = int(input())
size = list(map(int, input().split()))
N = int(input())
count_list = Counter(size)
amt = 0

for i in range(N):
    req_size, cost = list(map(int, input().split()))
    if count_list[req_size] > 0:
        amt += cost
        count_list[req_size] -= 1

print(amt)
    