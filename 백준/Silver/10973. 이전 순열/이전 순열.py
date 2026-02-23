import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

# 역순 조회 처음 감소하는 지점
idx = n - 1
while idx > 0 and arr[idx - 1] <= arr[idx]:
    idx -= 1
# 인덱스 감소하면서 조회

# 전부 조회 다했는데 이상없는경우
if idx == 0:
    print(-1)
    exit()

# 두번째 인덱스로 현재 arr[idx - 1]위치가 처음이 아닐때 이전 순열을 찾기 위함
j = n - 1
while arr[j] >= arr[idx - 1]:
    j -= 1

arr[idx - 1], arr[j] = arr[j], arr[idx - 1]
# 역순 조회이므로 오름차순이기에 내림차순으로 변경
arr[idx:] = reversed(arr[idx:])
print(*arr)