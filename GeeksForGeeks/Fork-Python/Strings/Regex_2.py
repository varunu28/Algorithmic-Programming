def validate(str):
    pat= r'^[a-z]+[!@#$%]+[0-9]+$'
    match=re.search(pat,str)
    if(match):
        return True
    else:
        return False

