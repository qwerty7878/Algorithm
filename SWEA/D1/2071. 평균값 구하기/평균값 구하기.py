t = int(input())

for i in range(t):
    arr = list(map(int, input().split()))
    ans = round(sum(arr) / len(arr))

    print(f'#{i + 1}', ans)