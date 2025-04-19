t = int(input())
for i in range(t):
    n,str = input().split()
    n = int(n)

    for j in str:
        print(j * n,end='')
    print()