t = int(input())
c = []
for _ in range(t):
    c.append(int(input()))

for i in c:
    q = i // 25
    d = (i % 25) // 10
    n = ((i % 25) % 10) // 5
    p = ((i % 25) % 10) % 5
    print(q, d, n, p)