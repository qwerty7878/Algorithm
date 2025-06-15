x,y,w,h = map(int,input().split())
arr = []
arr.append(x)
arr.append(y)
arr.append(abs(w-x))
arr.append(abs(h-y))
print(min(arr))