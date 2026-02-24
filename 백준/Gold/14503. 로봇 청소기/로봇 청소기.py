import sys
from collections import deque
input = sys.stdin.readline

n,m = map(int, input().split())
r,c,d = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(n)]

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

queue = deque()
queue.append((r, c, d))
count = 0

while queue:
    r, c, d = queue.popleft()

    if board[r][c] == 0:
        board[r][c] = 2
        count += 1

    visited = False
    nd = d

    for _ in range(4):
        nd = (nd + 3) % 4
        nr = r + dr[nd]
        nc = c + dc[nd]

        if board[nr][nc] == 0:
            queue.append((nr, nc, nd))
            visited = True
            break

    if visited:
        continue

    back = (d + 2) % 4
    br = r + dr[back]
    bc = c + dc[back]

    if board[br][bc] == 1:
        print(count)
        break
    else:
        queue.append((br, bc, d))