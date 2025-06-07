n,x = map(int,input().split())
arr = list(map(int, input().split()))
answer = []
for i in arr:
    if i >= x:
        continue
    else:
        answer.append(i)
print(*answer)