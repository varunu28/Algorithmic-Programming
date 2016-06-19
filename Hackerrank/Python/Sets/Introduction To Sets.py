n = int(input())
items= [x for x in input().split(' ')]
num = []
for i in items:
    num.append(int(i))

set_x = set(num)
ans = float(sum(set_x))/float(len(set_x))
print(ans)
