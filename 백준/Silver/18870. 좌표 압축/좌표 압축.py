import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
temp = sorted(set(arr))

dic = {temp[i] : i for i in range(len(temp))}

for i in arr:
      print(dic[i], end=" ")