from collections import Counter

t = int(input())
for test in range(1, t + 1):
    n = int(input())
    array = list(map(int, input().split()))

    count = Counter(array)
    for k,v in count.most_common(1):
        print(f'#{test} {k}')