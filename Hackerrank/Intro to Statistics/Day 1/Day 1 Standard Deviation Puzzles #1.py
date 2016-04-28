dev_sum = 0

num = [1,2,3]

for i in range(0,3):
    dev_sum+=pow((num[i]-round(float(sum(num))/float(3),1)),2)

initial_dev = round(pow(float(dev_sum)/float(3),0.5),1)

val = pow(pow(initial_dev,2)*4 - dev_sum , 0.5) + 2

print round(val,2)
