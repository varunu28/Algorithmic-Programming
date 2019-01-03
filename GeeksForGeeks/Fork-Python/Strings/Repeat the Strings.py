def combo_string(a, b):
    # your code here
    short = a if len(a) < len(b) else b
    longer = b if short == a else a
    
    return short+longer+short
