from warnings import catch_warnings

n,k = map(int,input().split())
answer = []

for i in range(1,n + 1):
    if n % i == 0:
        answer.append(i)

try:
    print(answer[k-1])
except IndexError:
    print(0)