m = int(input())
a = input()
lis = a.split()
m_list = list(map(int, lis))
a = []
j=0

while j < len(m_list):
    if m_list[j]!=m_list[j+1]:
        largest = max(m_list[j], m_list[j+1])
        largest2 = min(m_list[j], m_list[j+1])
        break
    j+=1

for i in m_list:
    if i > largest:
        largest2 = largest
        largest = i
    elif i<largest and i>largest2:
        largest2 = i

print(largest2)
        
    
