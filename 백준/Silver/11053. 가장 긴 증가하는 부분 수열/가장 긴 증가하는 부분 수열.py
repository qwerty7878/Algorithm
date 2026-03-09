n = int(input())
arr = list(map(int, input().split()))
dp = [1] * n

for current in range(1, n):
    for before in range(current):
        if arr[before] < arr[current]:
            if dp[current] < dp[before] + 1:
                dp[current] = dp[before] + 1
print(max(dp))