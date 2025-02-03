arrX = []
arrY = []
for i in range(3):
    x,y = map(int, input().split())
    arrX.append(x)
    arrY.append(y)

for i in arrX:
    if arrX.count(i) == 1:
        print(i,end=' ')

for i in arrY:
    if arrY.count(i) == 1:
        print(i,end=' ')