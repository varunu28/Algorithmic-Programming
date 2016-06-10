x = int(input())
x_list = list(range(0,x+1))

y = int(input())
y_list = list(range(0,y+1))

z = int(input())
z_list = list(range(0,z+1))

n = int(input())
ans = []

for i in x_list:
    for j in y_list:
        for k in z_list:
            temp = []
            if i+j+k != n:
                temp.append(i)
                temp.append(j)
                temp.append(k)
                ans.append(temp)
print(ans)
            
