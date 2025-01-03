n = int(input())
arr = list(map(int, input().split()))

score = max(arr)
for i in range(n):
    arr[i] = (arr[i] / score) * 100

print(sum(arr)/len(arr))