t = int(input())

for _ in range(t):
    w,k = map(int, input().split())
    print(w * k // 2)