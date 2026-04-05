t = int(input())

for testcase in range(t):
    n,m = map(int, input().split())

    arr = []
    for _ in range(n):
        arr.append(list(map(int, input().split())))

    answer = 0
    for i in range(n - m + 1):
        for j in range(n - m + 1):
            sum = 0
            for a in range(m):
                for b in range(m):
                    sum +=  arr[a + i][b + j]
            answer = max(answer, sum)

    print(f'#{testcase + 1} {answer}')