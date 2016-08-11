#!/usr/bin/env python3
main_str = input()
sub_str = input()
i = 0
count = 0

while i < len(main_str)-len(sub_str) + 1:
    if main_str[i:i+len(sub_str)] == sub_str:
        count += 1
    i += 1
print(count)
