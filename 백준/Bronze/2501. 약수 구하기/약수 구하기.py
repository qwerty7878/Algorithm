arr = []
n,k = map(int, input().split())
for i in range(1,n + 1):
    if n % i == 0:
        arr.append(i)

try:
    print(arr[k - 1])
except:
    print(0)