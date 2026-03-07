import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
s = input()

answer, idx, count = 0, 0, 0

while idx < (m - 1):
    if s[idx:idx + 3] == 'IOI':
        # 다음은 OI 이니까 2를 더함
        idx += 2
        count += 1

        # 범위까지 늘리며 확인하기
        if count == n:
            answer += 1
            # 하나 확인했으니 바로 옆에가 맞는지 확인하기 위해서 1만 줄임
            count -= 1
    else:
        # OOI 같은 경우
        idx += 1
        count = 0
print(answer)