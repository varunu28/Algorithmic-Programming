s = input()
s = s.split()
l, r, k = int(s[0]), int(s[1]), int(s[2])
count = 0
while l <= r:
    if l%k == 0:
        count += 1
    l += 1
print(count)
