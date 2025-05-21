n,b = map(int,input().split())
answer = ''
arr = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

while n > 0:
    answer += arr[n % b]
    n //= b

print(answer[::-1])