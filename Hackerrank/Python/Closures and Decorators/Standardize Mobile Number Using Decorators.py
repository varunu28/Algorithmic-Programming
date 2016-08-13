n = int(input())
l = list()
while n:
    n-=1
    l.append(int(input()[-10:]))
l.sort()

for i in l:
    print('+91' + ' ' + str(i)[0:5] + ' ' + str(i)[5:])
    