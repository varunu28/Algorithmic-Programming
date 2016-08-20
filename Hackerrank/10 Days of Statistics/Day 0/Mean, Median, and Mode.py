n = int(input())
arr = list(map(int, input().split()))
print(round(float(sum(arr))/float(n), 1))
arr.sort()
if n%2==0:
    sum = float(arr[int(n/2) - 1] + arr[int(n/2)])
    print(round(sum/float(2), 1))
else:
    print(round(float(arr[int(n/2)])/2))
    
max_c = 0
max_num = 0
for i in arr:
    if arr.count(i) > max_c:
        max_c = arr.count(i)
        max_num = i

print(max_num)