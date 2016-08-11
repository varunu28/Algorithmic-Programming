import calendar
date = input().strip().split()
days = list(calendar.day_name)
print(days[calendar.weekday(int(date[2]), int(date[0]), int(date[1]))].upper())
