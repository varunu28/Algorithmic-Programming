#Day 1: Basic Statistics - A Warmup
'''
Objective 
In this challenge, we practice calculating the mean, median, mode, standard deviation, and confidence intervals in statistics. Check out the Resources tab for helpful videos!

Task 
Given a single line of NN space-separated integers describing an array, calculate and print the following:

Mean (m): The average of all the integers.

m=x1+x2+x3+x4+…+xNN
m=x1+x2+x3+x4+…+xNN
where xixi is the ithith element of the array.

Array Median: If the number of integers is odd, display the middle element. Otherwise, display the average of the two middle elements.

Mode: The element(s) that occur most frequently. If multiple elements satisfy this criteria, display the numerically smallest one.

Standard Deviation (σσ):

σ=(x1−m)2+(x2−m)2+(x3−m)2+(x4−m)2+…+(xN−m)2N−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−√
σ=(x1−m)2+(x2−m)2+(x3−m)2+(x4−m)2+…+(xN−m)2N
where xixi is the ithith element of the array.

Other than the modal values (which should all be integers), the answers should be in decimal form, correct to a single decimal point, 0.00.0 format. An error margin of ±0.1±0.1 will be tolerated for
the standard deviation. The mean, mode and median values should match the expected answers exactly.

Assume the numbers were sampled from a normal distribution. The sample is a reasonable representation of the distribution. A user can approximate that the population
standard deviation ≃≃ standard deviation computed for the given points with the understanding that assumptions of normality are convenient approximations.

Scoring 
Scoring is proportional to the number of test cases cleared.

Input Format

The first line contains an integer, NN, denoting the number of elements in the array. 
The second line contains NN space-separated numbers describing the elements of the array.

Constraints

10≤N≤250010≤N≤2500
0<xi≤1050<xi≤105
Output Format

A total of five lines are required (in the following order:

Mean (format: 0.0) on the first line.
Median (format: 0.0) on the second line.
Mode(s) (numerically smallest integer in the case of multiple integers)
Standard Deviation (format: 0.0)
Sample Input

10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
Sample Output

43900.6
44627.5
4978
30466.9
''''

n = int(raw_input())
line=raw_input()
x = line.split(' ')
num=[]
for i in range(0,len(x)):
    num.append(int(x[i]))

print round(float(sum(num))/float(n),1)

num.sort()

if n%2 == 0:
    print float((num[n/2 - 1] + num[n/2 ])/float(2))
else:
    print num[n/2]

print max(num, key = num.count)

dev_sum = 0

for i in range(0,n):
    dev_sum+=pow((num[i]-round(float(sum(num))/float(n),1)),2)

print round(pow(float(dev_sum)/float(n),0.5),1)
