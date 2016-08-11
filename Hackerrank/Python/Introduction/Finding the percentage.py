n = int(raw_input())
i = 0
big_arr = []
while i < n:
    arr = raw_input().split()
    big_arr.append(arr)
    i += 1
name = raw_input()
i = 0
while i < n:
    if str(big_arr[i][0]) == str(name):
        l = len(big_arr[i])
        q = 1
        total = 0
        while q < l:
            total += float(big_arr[i][q])
            q += 1
        ans = float(total)/float(len(big_arr[i])-1)

        if len(str(ans)) <= 4:
            print str(ans)+"0"
        else:
            print round(ans, 2)

        i = n
    else:
        i += 1
