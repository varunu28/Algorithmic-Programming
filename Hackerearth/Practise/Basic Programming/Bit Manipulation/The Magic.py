def dec_to_bin(x):
    return int(bin(x)[2:])
    
t = int(input())
 
while t:
    count = 0
    n = int(input())
    print(str(dec_to_bin(n)).count('1'))
    t -= 1