t = int(input())

for i in range(t):
    sum = 0
    arr = list(map(int, input().split()))
    for j in arr:
        if j % 2 != 0:
            sum += j

    print(f'#{i + 1}', sum)