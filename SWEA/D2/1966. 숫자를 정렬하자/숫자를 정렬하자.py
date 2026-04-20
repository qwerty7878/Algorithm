t = int(input())
for test in range(t):
    n = int(input())
    arr = sorted(list(map(int, input().split())))
    answer = ' '.join(map(str, arr))
    print(f'#{test + 1} {answer}')