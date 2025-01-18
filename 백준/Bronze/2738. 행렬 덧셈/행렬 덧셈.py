n,m = map(int,input().split())

a = []
for i in range(n):
    num1 = list(map(int,input().split()))
    a.append(num1)

b = []
for i in range(n):
    num1 = list(map(int,input().split()))
    b.append(num1)

for i in range(n):
    for j in range(m):
        print(a[i][j] + b[i][j],end=' ')
    print()