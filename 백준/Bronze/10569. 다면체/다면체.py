t = int(input())
for i in range(t):
    v,e = map(int, input().split())

    print(abs(v - e) + 2)