import sys
input = sys.stdin.readline

n = int(input())
num = n
while True:
    if num == 1:
        print(2)
        break

    isPrime = True
    for div in range(2, int(num ** 0.5) + 1):
        if num % div == 0:
            isPrime = False
            break
        elif num % div != 0:
            isPrime = True

    if isPrime and str(num)[::-1] == str(num):
        print(num)
        break
    num += 1