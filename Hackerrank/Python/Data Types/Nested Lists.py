n = int(input())
arr = []

while n > 0:
    temp = []
    name = input()
    grade = float(input())
    temp.append(name)
    temp.append(grade)
    arr.append(temp)
    n -= 1

grade_arr = []

for i in arr:
    grade_arr.append(i[1])

grade_arr.sort()

m = 0
while m < len(grade_arr):
    if grade_arr[m] != grade_arr[m+1]:
        second_low = grade_arr[m+1]
        break
    m += 1

names = []

for j in arr:
    if j[1] == second_low:
        names.append(j[0])

names.sort()

for k in names:
    print(k)
