import sys

n = int(sys.stdin.readline())
dp = [0] * (n + 1)

for i in range(2, n + 1):
    # 이전의 최소 값의 + 1을 한 값이 가장 최소값이 됨
    # 1을 뺀다.라는 조건을 되돌렷을때 가장 변화가 작기때문
    # 1을 더할 경우 2일 때 -> 3, 2를 곱할 경우 -> 4, 3을 곱할 경우 -> 6 이 되기 때문
    dp[i] = dp[i - 1] + 1
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i//2] + 1)
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i//3] + 1)
print(dp[n])
