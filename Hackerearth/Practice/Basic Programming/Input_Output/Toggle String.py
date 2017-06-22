s = input()
ans_s = ''
for i in s:
    if i.isupper():
        ans_s += i.lower()
    elif i.islower():
        ans_s += i.upper()
print(ans_s)

