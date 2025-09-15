import sys

t = int(sys.stdin.readline())

dp = [0] * (t + 1)
arr = []
for i in range(t):
    arr.append(int(sys.stdin.readline()))

if len(arr) < 3:
    # 계단이 3개 이하인경우 합이 최고임
    print(sum(arr))
else:
    dp[0] = arr[0]
    # 안밟는 경우의 수도 존재하지만 최댓값을 만들어야하니까 다음 발판은 무조건 밟아야함
    dp[1] = arr[0] + arr[1]

    for i in range(2, t):
        # 1 2 4 의 경우 와 2 3 의 경우 중 더 큰 수 비교하기
        dp[i] = max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i])
    print(dp[t - 1])