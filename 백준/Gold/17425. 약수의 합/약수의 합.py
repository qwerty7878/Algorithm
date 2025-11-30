import sys

MAX = 1000000
dp = [0] * (MAX + 1)

for i in range(1, MAX + 1):
    for j in range(i, MAX + 1, i):
        dp[j] += i
    dp[i] += dp[i - 1]

t = int(sys.stdin.readline().strip())
for _ in range(t):
    n = int(sys.stdin.readline().strip())
    print(dp[n])