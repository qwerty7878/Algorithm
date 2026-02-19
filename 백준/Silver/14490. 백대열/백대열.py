def gcd(a,b):
    if b == 0:
        return a
    return gcd(b, a % b)

n,m = map(int, input().split(':'))
div = gcd(n,m)
print(f'{n//div}:{m//div}')