def fibo(N):
    ser = []
    a = 0
    b = 1
    if N == 1:
        ser.append(a)
        return ser
    elif N == 0:
        return ser
    
    ser.append(a)
    ser.append(b)
    while N > 2:
        c = a + b
        ser.append(c)
        a = b
        b = c
        N -= 1

    return ser
    
    
N = int(input())
print(list(map(lambda x: x*x*x, fibo(N))))
