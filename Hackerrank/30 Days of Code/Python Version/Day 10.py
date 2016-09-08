def dec_to_bin(dec_inp):
    ans_bin=''
    while dec_inp>0:
        ans_bin=ans_bin+str(dec_inp%2)
        dec_inp=int(dec_inp/2)
    return ans_bin[::-1]

n = int(input())

str_n = dec_to_bin(n)

max_count = 0
count = 1
i = 0

while i < len(str_n)-1:
    if str_n[i] == str_n[i+1] and str_n[i]=='1':
        count+=1
    else:
        max_count = max(max_count,count)
        count = 1
    i+=1
    
max_count = max(max_count,count)
print(max_count)
