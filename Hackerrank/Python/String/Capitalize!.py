inp_str = input().split(' ')
out = []

for i in inp_str:
    if i:
        out.append(i[0].upper() + i[1:].lower())
    else:
        out.append('')

print(' '.join(out))
