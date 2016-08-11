import textwrap
s = input()
w = int(input())
str_arr = textwrap.wrap(s, w)
for i in str_arr:
    print(i)
