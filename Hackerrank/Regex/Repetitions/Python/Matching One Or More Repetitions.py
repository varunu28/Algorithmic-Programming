Regex_Pattern = r'^[0-9]+[A-Z]+[a-z]+$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())
