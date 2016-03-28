dev_sum = 0

num = [1,2,3]

for i in range(0,3):
    dev_sum+=pow((num[i]-round(float(sum(num))/float(3),1)),2)

print round(pow(float(dev_sum)/float(3),0.5),1)

