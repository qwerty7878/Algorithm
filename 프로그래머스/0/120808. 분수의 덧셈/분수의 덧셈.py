def solution(numer1, denom1, numer2, denom2):
    
    resultNumer = (numer1 * denom2) + (numer2 * denom1)
    resultDenom = denom1 * denom2
    
    gcdNum = gcd(resultNumer, resultDenom)
    
    answer = [resultNumer//gcdNum, resultDenom//gcdNum]
    return answer

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)