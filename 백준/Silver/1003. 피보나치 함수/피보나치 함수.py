import sys
input = sys.stdin.readline

t = int(input().strip())
dp = [[]] * 41
dp[0] = [1, 0]
dp[1] = [0, 1]
dp[2] = [1, 1]

for _ in range(t):
    n = int(input().strip())

    for j in range(3, n + 1):
        dp[j] = dp[j - 1][0] + dp[j - 2][0], dp[j - 1][1] + dp[j - 2][1]
    print(dp[n][0], dp[n][1])