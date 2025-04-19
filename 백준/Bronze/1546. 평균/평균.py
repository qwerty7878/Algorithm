n = int(input())
arr = list(map(int, input().split()))
maxN = max(arr)

for i in range(len(arr)):
    arr[i] = arr[i] / maxN * 100

print(sum(arr) / len(arr))