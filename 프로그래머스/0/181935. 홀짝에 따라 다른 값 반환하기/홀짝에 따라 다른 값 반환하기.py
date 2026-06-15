def solution(n):
    hap = 0
    if n % 2 != 0:
        for num in range(1, n + 1):
            if num % 2 != 0:
                hap += num
        return hap
    else:
        for num in range(1, n + 1):
            if num % 2 == 0:
                hap += (num ** 2)
        return hap