import sys
from collections import Counter

input = sys.stdin.readline

s = input().strip()
count = Counter(s)

# 펠린드롬은 홀수가 1번만나옴
oddcnt = 0
for k,v in count.items():
    if v % 2 == 1:
        oddcnt += 1

if oddcnt > 1:
    print("I'm Sorry Hansoo")
    exit()

# 절반
left = []
mid = ''
for char in sorted(count.keys()):
    # 홀수 1개가 중앙에 해당해야함
    if count[char] % 2 == 1:
        mid = char
    # 절반 문자열 만들기
    left.append(char * (count[char] // 2))
# print(left)

temp = ''.join(left)
right = temp[::-1]
ans = temp + mid + right
print(ans)