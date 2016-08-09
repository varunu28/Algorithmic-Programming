from collections import deque

def stackable(cubes):
    curr = cubes.popleft() if cubes[0] > cubes[-1] else cubes.pop()
    while cubes:
        left, right = cubes[0], cubes[-1]
        if left >= right and left <= curr:
            curr = cubes.popleft()
        elif right > left and right <= curr:
            curr = cubes.pop()
        else:
            return False
    return True

for i in range(int(input())):
    n, cubes = input(), deque(map(int, input().split()))
    print('Yes' if stackable(cubes) else 'No') 