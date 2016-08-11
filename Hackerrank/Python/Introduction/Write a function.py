def is_leap(y):
    leap = False
    if y % 4 == 0:
        leap = True
    if y % 100 == 0 and y % 400 == 0:
        leap = True
    else:
        leap = False

    return leap

y = int(input())
print(is_leap(y))
