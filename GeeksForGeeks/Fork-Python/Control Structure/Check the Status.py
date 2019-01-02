def check_status(a, b, status):
    ##Your code here
    ##Either True or False is returned
    if status:
        return a < 0 and b < 0
    else:
        return (a > 0 and b < 0) or (a < 0 and b > 0)
