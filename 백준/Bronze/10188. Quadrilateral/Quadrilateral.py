t = int(input())

for _ in range(t):
    a,b = map(int, input().split())

    for i in range(b):
        print(a * 'X')
    print()