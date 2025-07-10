import sys

n,k = map(int,sys.stdin.readline().split())
coin = []

for i in range(n):
      coin.append(int(sys.stdin.readline()))
coin.sort(reverse=True)

cnt = 0
for i in coin:
      if i > k:
            continue
      else:
            if k % i == 0:
                  cnt += k // i
                  break
            else:
                  cnt += k // i
                  k = k % i
print(cnt)