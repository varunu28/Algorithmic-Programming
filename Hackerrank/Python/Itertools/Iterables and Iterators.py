from itertools import combinations

n = int(input())
inp = list(map(str, input().strip().split(' ')))
k = int(input())
full_list = []
count = 0
total = 0

for i in list(combinations(inp, k)):
    full_list.append(''.join(i))
    if 'a' in i:
        count += 1
    total += 1


ans = float(count)/float(total)
print("{0:.3f}".format(ans))
