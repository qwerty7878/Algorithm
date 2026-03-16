import sys
input = sys.stdin.readline
INF = 1e9

n = int(input())
m = int(input())

# 플로이드 워셜은 2차원 배열 선언이 필수
graph = [[INF] * (n + 1) for _ in range(n + 1)]
for idx in range(1, n + 1):
    graph[idx][idx] = 0

for _ in range(m):
    a,b,c = map(int, input().split())
    graph[a][b] = min(graph[a][b], c)
    
# 플로이드 워셜 알고리즘
for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

for x in range(1, n + 1):
    for y in range(1, n + 1):
        if graph[x][y] == INF:
            print(0, end=' ')
        else:
            print(graph[x][y], end=' ')
    print()