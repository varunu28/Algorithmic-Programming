from collections import deque

d = deque()
n = int(input())

for i in range(n):
	line = input().split()
	if len(line) == 2:
		if line[0] == 'append':
			d.append(line[1])
		elif line[0] == 'appendleft':
			d.appendleft(line[1])
	else:
		if line[0] == 'pop':
			d.pop()
		elif line[0] == 'popleft':
			d.popleft()
print(' '.join(list(d)))