
n = int(input())
phone_dict = {}
i=0

while i<n:
    a,b = input().split(" ")
    phone_dict[a]= int(b)
    i+=1

query=[]

while True:
    try:
        query.append(input()) # Or whatever prompt you prefer to use.
    except EOFError:
        break 

i=0
while i<len(query):
    if query[i] in phone_dict:
        print(query[i]+"=" + str(phone_dict[query[i]]))
    else:
        print("Not found")
    i+=1

