import sys

n,b = map(int,sys.stdin.readline().split())

arr = []
while True:
      if n < b:
            arr.append(n)
            break

      arr.append(n % b)
      n = n // b

ans = ''
for i in reversed(arr):
      if i < 10:
            ans += str(i)
      else:
            ans += chr(ord('A') + i - 10)
print(ans)