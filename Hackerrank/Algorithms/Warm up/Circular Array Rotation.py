n,k,q = list(map(int, input().split()))
arr = list(map(int, input().split()))

k %= n
arr = arr[-k:] + arr[:-k]
    
for i in range(q):
    print(arr[int(input())])