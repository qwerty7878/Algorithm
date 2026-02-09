import sys
input = sys.stdin.readline

n, k = map(int, input().split())

coins = []
count = 0

for _ in range(n):
    won = int(input().strip())
    coins.append(won)

coins.sort(reverse=True)

for coin in coins:
    if k >= coin:
        if k % coin == 0:
            count += (k // coin)
            break
        else:
            count += (k // coin)
            k %= coin
print(count)