import sys

input = sys.stdin.readline

t = int(input())
ingre = []

for _ in range(t):
    s, b = map(int, input().rstrip().split())
    ingre.append((s, b))
# print(ingre)
ans = float('inf')

def dfs(depth, sour, bitter, isused):
    global ans

    if depth == t:
        if isused:
            ans = min(ans, abs(sour - bitter))
        return

    s, b = ingre[depth]

    # 현재 재료 사용 안한 경우
    dfs(depth + 1, sour * s, bitter + b, True)
    # 현재 재료 사용한 경우
    dfs(depth + 1, sour, bitter, isused)

dfs(0, 1, 0, False)
print(ans)