a = int(input())
b = int(input())
c = int(input())
res = a * b * c

for i in range(0, 10):
	print(str(res).count(str(i)))