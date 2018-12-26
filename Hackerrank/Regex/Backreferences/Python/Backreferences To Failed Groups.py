Regex_Pattern = r"^[0-9]{2}(-?)[0-9]{2}\1[0-9]{2}\1[0-9]{2}$"	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())
