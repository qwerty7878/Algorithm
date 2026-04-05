from collections import Counter

t = int(input())

for test in range(t):
    n = int(input())
    arr = list(input())
    count = Counter(arr)
    mx_values = max(count.values())
    if mx_values > 1:
        for k, v in count.most_common(1):
            print(f"#{test + 1} {k} {v}")
    else:
        mx_key = max(count.keys())
        print(f"#{test + 1} {mx_key} {1}")