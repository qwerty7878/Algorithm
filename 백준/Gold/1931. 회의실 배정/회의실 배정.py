import sys
input = sys.stdin.readline

n = int(input())
room = []

for _ in range(n):
    start, end = map(int, input().split())
    room.append((start, end))

# 시작순 정렬
room.sort(key=lambda x : x[0])
# 끝나는 값 우선 정렬
room.sort(key=lambda x : x[1])
# print(room)

count = 1
current_time = room[0][1]

for idx in range(1, len(room)):
    if room[idx][0] >= current_time:
        count += 1
        current_time = room[idx][1]

print(count)