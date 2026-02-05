from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
num = []

for _ in range(n):
    num.append(int(input()))
num.sort()

# 산술평균
avg = sum(num) / len(num)
print(int(round(avg)))

# 중앙값
print(num[len(num) // 2])

# 최빈값
count = Counter(num)
most_common_num = max(count.values())

most_common_list = [k for k, v in count.items() if v == most_common_num]
most_common_list.sort()
# print(most_common_list)

if len(most_common_list) < 2:
    print(most_common_list[0])
else:
    print(most_common_list[1])

# 범위
print(num[-1] - num[0])