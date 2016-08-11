N, X = [int(x) for x in input().split()]

scores = []

for i in range(X):
    l = list(map(float, input().strip().split(' ')))
    scores.append(l)

print(*[sum(student)/len(student) for student in zip(*scores)], sep='\n')
