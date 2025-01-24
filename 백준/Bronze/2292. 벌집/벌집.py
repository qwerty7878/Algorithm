n = int(input())
cnt = 1
num = 1
while num < n:
    num += 6 * cnt
    cnt += 1

print(cnt)