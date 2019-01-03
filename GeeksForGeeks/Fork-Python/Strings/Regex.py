def numberMatcher(str):
    pat=r'\d+'
    match=re.findall(pat,str) ##find all finds all the matched texts and returns a list
    if(match): 
        for i in match:
            print(i, end=" ")
    else:
        print(-1,end="")

