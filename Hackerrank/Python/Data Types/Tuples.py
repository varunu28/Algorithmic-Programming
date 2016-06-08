n = int(input())
items= [x for x in input().split(' ')]
tup = ( )
for i in range(n):
    tup2 = (int(items[i]),)
    tup = tup + tup2
print(hash(tup))
