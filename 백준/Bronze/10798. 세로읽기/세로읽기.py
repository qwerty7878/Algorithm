arr = [] * 15

for i in range(5):
	arr.append(input())

for i in range(15):
	for j in range(5):
		try:
			print(arr[j][i], end="")
		except:
			continue