n,m = map(int,input().split())

arr1 = []
for i in range(n):
    arr1.append(input())

arr2 = []
for i in range(m):
    arr2.append(input())

arr1.sort()
def binary_search(arr, target):
    start = 0
    end = len(arr) - 1
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return True
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return False

count = 0
for i in arr2:
    if binary_search(arr1, i):
        count += 1

print(count)