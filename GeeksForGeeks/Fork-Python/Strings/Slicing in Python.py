def join_middle(bound_by, tag_name):
    # complete the statement below to return the string as required
    return bound_by[0 : len(bound_by)//2] + tag_name + bound_by[len(bound_by) // 2 : ]
