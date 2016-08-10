import re
for _ in range(int(input())):
    ans = True
    try:
        re.compile(input())
    except:
        ans = False
    print(ans)