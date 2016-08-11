inp_str = input()
out_str = ''
i = 0

while i < len(inp_str):
    if inp_str[i].islower():
        out_str += inp_str[i].upper()
    elif inp_str[i].isupper():
        out_str += inp_str[i].lower()
    else:
        out_str += inp_str[i]
    i += 1

print(out_str)
