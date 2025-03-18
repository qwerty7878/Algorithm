import math

def solution(numer1, denom1, numer2, denom2):
    down = denom1 * denom2
    up = (numer1 * denom2) + (numer2 * denom1)
    
    if up % math.gcd(up,down) == 0:
        newup = up // math.gcd(up,down)
        newdown = down // math.gcd(up,down)
        return [newup,newdown]
    else:
        return [up,down]