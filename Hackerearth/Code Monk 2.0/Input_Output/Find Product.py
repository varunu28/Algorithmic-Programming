n = int(input())
s = input()
s = s.split()
prod = 1
for i in s:
    prod = (prod*int(i))%1000000007
print(prod)

