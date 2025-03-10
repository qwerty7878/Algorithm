n = int(input())
arr = list(map(int, input().split()))

temp = sorted(set(arr))
answer = {num: idx for idx, num in enumerate(temp)}

for num in arr:
    print(answer[num], end=' ')