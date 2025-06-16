t = int(input())

arrx = []
arry = []
for i in range(t):
    x,y = map(int, input().split())
    arrx.append(x)
    arry.append(y)

arrx.sort()
arry.sort()

if len(arrx) <= 1 or len(arry) <= 1:
    print(0)
else:
    print((arrx[-1] - arrx[0]) * (arry[-1] - arry[0]))