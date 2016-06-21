n = int(input())
eng = set(map(int, input().split())) 

m = int(input())
french = set(map(int, input().split())) 

both = eng.intersection(french)
print(len(both))
