import sys

input = sys.stdin.readline

n = int(input())
coin = 0

while True:
    if n % 5 == 0:
        coin += n // 5
        break

    if n == 2:
        coin += 1
        break

    n -= 2
    coin += 1

    if n <= 1:
        print(-1)
        exit()
print(coin)