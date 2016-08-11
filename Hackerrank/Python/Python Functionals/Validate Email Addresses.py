import re

pat = re.compile(r'^[\w-]+@[a-zA-Z0-9]+\.\w{1,3}$')

out = []
for _ in range(int(input())):
    s = input()
    if re.match(pat, s):
        out.append(s)

out.sort()
print(out)