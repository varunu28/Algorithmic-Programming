n = int(input())
arr = list(map(int, input().split()))
mean = round(float(sum(arr))/float(n), 1)
diff_sum = 0

for i in arr:
    diff_sum += (i - mean)**2
    
print(round((float(diff_sum)/n)**0.5, 1))