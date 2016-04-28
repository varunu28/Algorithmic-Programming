T = int(input())
while T>0:
    T-=1
    s = input()
    i = 0
    even = ""
    odd = ""
    while i<len(s):
        if(i%2==0):
            even+=s[i]
        else:
            odd+=s[i]
        i+=1
    print(even + " " + odd)
    
