def gcm(a, b):
    if b == 0:
        return a
    return gcm(b, a % b)

def lcm(n, m):
    return n * m // gcm(n, m)

def solution(n, m):
    gnum = gcm(n, m)
    lnum = lcm(n, m)
    
    return [gnum, lnum]