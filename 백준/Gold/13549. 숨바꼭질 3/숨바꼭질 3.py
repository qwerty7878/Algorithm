import sys
from collections import deque

input = sys.stdin.readline

n, k = map(int, input().split())
# 현재위치
position = [0] * 100001

q = deque()
# 초기 값
q.append(n)

while q:
    current = q.popleft()
    if current == k:
        print(position[current])
        break

    for time in (current * 2, current - 1, current + 1):
        if 0 <= time <= 100000 and not position[time]:
            if time == current * 2:
                # 순간이동
                position[time] = position[current]
            else:
                # 1초 카운팅
                position[time] = position[current] + 1
            q.append(time)