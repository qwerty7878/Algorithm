from math import factorial

n,k = map(int,input().split())

# print(factorial(n) // (factorial(n - k) * factorial(k)))

def fac(num):
	if num == 1 or num == 0:
		return 1
	elif num == 2:
		return 2
	else:
		return num * fac(num-1)


print(fac(n) // (fac(n - k) * fac(k)))