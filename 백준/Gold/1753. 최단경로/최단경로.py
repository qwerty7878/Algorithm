import sys
import heapq

input = sys.stdin.readline
INF = 1e9

V,e = map(int, input().split())
k = int(input())

graph = [[] for _ in range(V + 1)]
distance = [INF] * (V + 1)

for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))

def dijkstra(start):
    h = []
    distance[start] = 0
    heapq.heappush(h, (distance[start], start))

    while h:
        dist, now = heapq.heappop(h)

        if distance[now] < dist:
            continue

        for x in graph[now]:
            cost = dist + x[1]

            if distance[x[0]] > cost:
                distance[x[0]] = cost
                heapq.heappush(h, (cost, x[0]))
    return distance

ans = dijkstra(k)

for idx in range(1, len(distance)):
    if distance[idx] == INF:
        distance[idx] = 'INF'
    print(distance[idx])