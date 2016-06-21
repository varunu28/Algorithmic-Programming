n = int(input())
eng = set(map(int, input().split())) 

m = int(input())
french = set(map(int, input().split())) 

both = eng.symmetric_difference(french)
print(len(both))
