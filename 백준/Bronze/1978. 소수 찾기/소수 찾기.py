n = int(input())
isPrimeNum = list(map(int, input().split(' ')))

count = 0
for num in isPrimeNum:
    if num < 2:
        continue
    if num == 2:
        count += 1
        continue
    else:
        for i in range(2, num):
            if num % i == 0:
                break
            elif i + 1 == num and num % i != 0:
                count += 1
print(count)