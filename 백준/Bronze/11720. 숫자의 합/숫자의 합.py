n = input()
num = int(input())

sum = 0
while num > 10:
    sum += num % 10
    num = num // 10

sum += num % 10

if num >= 10:
    num = num // 10
    sum += num % 10
print(sum)