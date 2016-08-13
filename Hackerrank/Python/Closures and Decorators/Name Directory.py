n = int(input())
arr = list()
while n:
    n-=1
    l = list(map(str, input().split()))
    temp = []
    temp.append(l[0]+' '+l[1])
    temp.append(int(l[2]))
    temp.append(l[3])
    arr.append(tuple(temp))

new_arr = sorted(arr, key=lambda x: x[1])
for i,j,k in new_arr:
    if k == 'M':
        print('Mr. '+i)
    else:
        print('Ms. '+i)