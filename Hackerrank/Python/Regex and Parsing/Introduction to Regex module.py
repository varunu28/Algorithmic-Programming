import re
T = int(input())
reg = r'^[+-]?\d*\.{1}\d+$'

for i in range(T):
    N = input()
    print(bool(re.search(reg, N)))import re
T = int(input())
reg = r'^[+-]?\d*\.{1}\d+$'

for i in range(T):
    N = input()
    print(bool(re.search(reg, N)))