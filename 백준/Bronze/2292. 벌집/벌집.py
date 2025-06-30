import sys

n = int(sys.stdin.readline())

room = 1
idx = 1
before = 0
while True:
    if before < room and n <= room:
        break
    before = room
    room += (idx * 6)
    idx += 1
print(idx)