def factorial(n):
    if n == 1 or n == 0:
        return 1
    else:
        fact = 1
        for i in range(n):
            fact = fact * (i + 1)
        return fact

n = int(input())
print(factorial(n) % 10)