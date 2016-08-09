import collections

n = int(input())
inp_dict = collections.OrderedDict()

for i in range(n):
    temp = input()
    if temp in inp_dict:
        inp_dict[temp] += 1
    else:
        inp_dict[temp] = 1
 
print(len(inp_dict))
ans = ''

for i in inp_dict:
    ans += str(inp_dict[i]) + ' '

print(ans)