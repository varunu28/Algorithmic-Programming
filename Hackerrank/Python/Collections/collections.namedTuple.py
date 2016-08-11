import collections

N = int(input())
total = 0
columns = ','.join(input().split())
Student = collections.namedtuple('Student', columns)

for j in range(N):
    line = input().split()
    student = Student(*line)
    total += int(student.MARKS)

print(total/N)
