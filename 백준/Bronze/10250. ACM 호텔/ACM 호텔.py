import sys

t = int(sys.stdin.readline())

for _ in range(t):
	h,w,n = map(int, sys.stdin.readline().split())

	if n % h != 0:
		floor = n % h
	else:
		floor = h

	if n / h == n // h:
		roomNum = n // h

	else:
		roomNum = (n // h) + 1

	if roomNum < 10:
		roomNum = '0' + str(roomNum)
		print(str(floor) + roomNum)
	else:
		roomNum = str(roomNum)
		print(str(floor) + roomNum)