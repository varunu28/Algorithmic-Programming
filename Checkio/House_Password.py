def hasNumbers(inputString):
    return any(char.isdigit() for char in inputString)

def checkio(data):
    ans = True 
    #replace this for solution
    
    if not(hasNumbers(data)):
        ans = False
    
    upper_count = 0
    lower_count = 0
    
    for i in data:
        if i.islower():
            lower_count+=1
            break
    
    for i in data:
        if i.isupper():
            upper_count+=1
            break
    
    if not(len(data)>=10 and upper_count>0 and lower_count>0):
        ans = False
    
    return ans
#Some hints
#Just check all conditions


if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    assert checkio('A1213pokl') == False, "1st example"
    assert checkio('bAse730onE4') == True, "2nd example"
    assert checkio('asasasasasasasaas') == False, "3rd example"
    assert checkio('QWERTYqwerty') == False, "4th example"
    assert checkio('123456123456') == False, "5th example"
    assert checkio('QwErTy911poqqqq') == True, "6th example"
