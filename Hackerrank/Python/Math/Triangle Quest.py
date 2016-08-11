# More than 2 lines will result in 0 score. Do not leave a blank line also
for i in range(1, int(input())):
    print(int(i * (10**i - 1) / 9))
