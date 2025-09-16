import sys

t = int(sys.stdin.readline())

for _ in range(t):
    n = int(sys.stdin.readline())

    dp = [0] * 11
    dp[1] = 1
    # 1 + 1, 2
    dp[2] = 2
    # 1 + 1 + 1, 1 + 2, 2 + 1, 3
    dp[3] = 4

    for i in range(4, 11):
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    print(dp[n])