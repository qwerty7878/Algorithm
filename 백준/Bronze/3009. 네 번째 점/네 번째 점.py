arrX = []
arrY = []

for _ in range(3):
    x,y = map(int, input().split())

    if x in arrX:
        arrX.remove(x)
    else:
        arrX.append(x)

    if y in arrY:
        arrY.remove(y)
    else:
        arrY.append(y)

print(arrX.pop(),arrY.pop())