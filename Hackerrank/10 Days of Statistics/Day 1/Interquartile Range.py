def find_med(arr, n):
    if n%2 == 0:
        sum = arr[int(n/2) - 1] + arr[int(n/2)]
        med = round(float(sum)/2, 1)
    else:
        med = arr[int(n/2)]
    return med

n = int(input())
arr = list(map(int, input().split()))
freq_arr = list(map(int, input().split()))
arr_main = list()

i = 0
while i < n:
    arr_main = arr_main + [arr[i]]*freq_arr[i]
    i+=1

arr_main.sort()
Q2 = find_med(arr_main, len(arr_main))    

L_arr = list()
U_arr = list()

for i in arr_main:
    if i < Q2:
        L_arr.append(i)
    elif i > Q2:
        U_arr.append(i)

Q1 = find_med(L_arr, len(L_arr))
Q3 = find_med(U_arr, len(U_arr))
print(Q3 - Q1)