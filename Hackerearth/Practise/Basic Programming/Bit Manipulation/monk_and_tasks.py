def dec_to_bin(x):
    return int(bin(x)[2:])
    
t = int(input())
while t:
    t -= 1
    n = int(input())
    l = list(map(int, input().split()))
    
    ans = []
    for i in l:
        temp = str(dec_to_bin(i)).count('1')
        a = int(temp),i
        ans.append(a)
        
    ans.sort()
    stri = ''
    for i,j in ans:
        stri = stri + str(j) + ' '
        
    
    
    print(stri)