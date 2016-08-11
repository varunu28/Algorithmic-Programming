n = []
query = int(input())

while query > 0:
    list1 = [x for x in input().split(' ')]
    if list1[0] == 'insert':
        n.insert(int(list1[1]), int(list1[2]))
    elif list1[0] == 'print':
        print(n)
    elif list1[0] == 'append':
        n.append(int(list1[1]))
    elif list1[0] == 'sort':
        n.sort()
    elif list1[0] == 'remove':
        n.remove(int(list1[1]))
    elif list1[0] == 'reverse':
        n.reverse()
    elif list1[0] == 'count':
        print(n.count(int(list1[1])))
    elif list1[0] == 'pop':
        temp = n.pop()
        # print(temp)
    query -= 1
