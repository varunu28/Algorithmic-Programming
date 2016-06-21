n = int(input())
eng = set(map(int, input().split())) 

m = int(input())
french = set(map(int, input().split())) 

both = eng.union(french)
print(len(both))
