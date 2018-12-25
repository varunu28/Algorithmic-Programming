Regex_Pattern = r'^[0-9]{2,}[a-z]*[A-Z]*$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())
