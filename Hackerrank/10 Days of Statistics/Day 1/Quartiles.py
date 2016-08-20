def find_med(arr, n):
    if n%2 == 0:
        sum = arr[int(n/2) - 1] + arr[int(n/2)]
        med = int(sum/2)
    else:
        med = int(arr[int(n/2)])
    return med

n = int(input())
arr = list(map(int, input().split()))
arr.sort()

Q2 = find_med(arr, n)

L_arr = list()
U_arr = list()

for i in arr:
    if i < Q2:
        L_arr.append(i)
    elif i > Q2:
        U_arr.append(i)

print(find_med(L_arr, len(L_arr)))
print(Q2)
print(find_med(U_arr, len(U_arr)))