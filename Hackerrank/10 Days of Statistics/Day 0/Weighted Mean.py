n = int(input())
num_arr = list(map(int, input().split()))
w_arr = list(map(int, input().split()))

sum_n = 0
i = 0
while i < n:
    sum_n += num_arr[i]*w_arr[i]
    i += 1
sum_f = float(sum_n)
print(round(sum_n/sum(w_arr), 1))