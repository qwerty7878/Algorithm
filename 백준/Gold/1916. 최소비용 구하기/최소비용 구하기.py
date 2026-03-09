import sys
import heapq

input = sys.stdin.readline
INF = 1e9

n = int(input())
m = int(input())

graph = [[] for _ in range(n + 1)]
distances = [INF] * (n + 1)

for _ in range(m):
    u,v,w = map(int, input().split())
    graph[u].append((v,w))

start, end = map(int, input().split())

def dijkstra(start):
    h = []
    distances[start] = 0
    heapq.heappush(h, (distances[start], start))

    while h:
        dist, now = heapq.heappop(h)

        if distances[now] < dist:
            continue

        for x in graph[now]:
            cost = dist + x[1]
            if cost < distances[x[0]]:
                heapq.heappush(h, (cost, x[0]))
                distances[x[0]] = cost

dijkstra(start)
print(distances[end])