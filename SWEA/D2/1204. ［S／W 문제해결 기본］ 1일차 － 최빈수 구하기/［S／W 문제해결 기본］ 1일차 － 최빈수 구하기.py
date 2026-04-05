from collections import Counter

t = int(input())

for i in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    count = Counter(arr)
    answer = count.most_common(1)[0][0]
    print(f'#{n} {answer}')