import sys
input = sys.stdin.readline

n,m = map(int, input().split())
arr = []
for _ in range(n):
    arr.append(list(map(int, input().split())))

t = int(input())
for _ in range(t):
    count = 0
    i,j,x,y = map(int, input().split())
    for a in range(i - 1, x):
        for b in range(j - 1, y):
            count += arr[a][b]
    print(count)