arrx = []
arry = []

for i in range(3):
    x,y = map(int, input().split())

    if x in arrx:
        arrx.remove(x)
    else:
        arrx.append(x)
        
    if y in arry:
        arry.remove(y)
    else:
        arry.append(y)

print(arrx.pop(), arry.pop())