def isPrime(n):
	i = 2
	while i < n/2:
		if n%i == 0:
			return False
		i += 1
	return True

def isPalin(n):
	return str(n) == str(n)[::-1]

i = 1000

while True:
	if isPrime(i) and isPalin(i):
		break
	i -= 1
	
print(i)
