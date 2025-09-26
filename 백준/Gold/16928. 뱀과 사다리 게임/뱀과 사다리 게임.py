from collections import deque

n,m = map(int,input().split())
board = [0] * 101
visited = [False] * 101

ladder = dict()
snake = dict()

for i in range(n):
    a,b = map(int,input().split())
    ladder[a] = b

for i in range(m):
    a,b = map(int,input().split())
    snake[a] = b

def bfs():
    queue = deque([1])
    visited[1] = True

    while queue:
        pos = queue.popleft()

        for i in range(1,7):
            move = pos + i
            if 0 < move <= 100 and not visited[move]:
                if move in ladder.keys():
                    move = ladder[move]
                if move in snake.keys():
                    move = snake[move]

                if not visited[move]:
                    queue.append(move)
                    visited[move] = True
                    board[move] = board[pos] + 1

bfs()
print(board[100])