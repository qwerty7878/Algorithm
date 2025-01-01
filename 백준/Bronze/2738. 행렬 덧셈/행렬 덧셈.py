n,m = map(int, input().split())

A,B = [], []

for i in range(n):
    a = list(map(int, input().split()))
    A.append(a)

for i in range(n):
    b = list(map(int, input().split()))
    B.append(b)

for i in range(n):
    for j in range(m):
        print(A[i][j] + B[i][j], end=" ")
    print()