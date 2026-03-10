import sys
import heapq

input = sys.stdin.readline
INF = 1e9

n, e = map(int, input().split())

graph = [[] for _ in range(n + 1)]

for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))
    graph[b].append((a, c))

v1, v2 = map(int, input().split())

def dijkstra(start):
    h = []
    
    distances = [INF] * (n + 1)
    distances[start] = 0
    heapq.heappush(h, (0, start))

    while h:
        dist, now = heapq.heappop(h)
        if distances[now] < dist:
            continue

        for x in graph[now]:
            cost = dist + x[1]
            if cost < distances[x[0]]:
                distances[x[0]] = cost
                heapq.heappush(h, (cost, x[0]))

    return distances

original_distance = dijkstra(1)
v1_distance = dijkstra(v1)
v2_distance = dijkstra(v2)

path_v1 = original_distance[v1] + v1_distance[v2] + v2_distance[n]
path_v2 = original_distance[v2] + v2_distance[v1] + v1_distance[n]

answer = min(path_v1, path_v2)

if answer < INF:
    print(answer)
else:
    print(-1)