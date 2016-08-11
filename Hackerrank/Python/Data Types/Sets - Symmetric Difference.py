m = int(input())
a = input()
lis = a.split()
m_list = list(map(int, lis))
set1 = set(m_list)
n = int(input())
a = input()
lis = a.split()
n_list = list(map(int, lis))
set2 = set(n_list)

x = set1.difference(set2)
y = set2.difference(set1)

z = set()
z = x.union(y)

lst = list(z)
lst = sorted(lst)
for i in lst:
    print(i)
