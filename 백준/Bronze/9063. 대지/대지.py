t = int(input())

arrX = []
arrY = []
for _ in range(t):
    x,y = map(int, input().split())
    arrX.append(x)
    arrY.append(y)

print((max(arrX) - min(arrX)) * (max(arrY) - min(arrY)))