import sys
input = sys.stdin.readline

n, r, c = map(int, input().split())
ans = 0

while n != 0:
    n -= 1

    # 1사분면
    if r < 2 ** n and c >= 2 ** n:
        # 예시 기준 첫번째 16 (16 * 1)
        ans += (2 ** n) * (2 ** n) * 1
        # 압축되면 가로길이가 줄어듬
        c -= (2 ** n)
        
    # 2사분면
    elif r < 2 ** n and c < 2 ** n:
        # 예시 기준 첫번째 0 (16 * 0)
        ans += (2 ** n) * (2 ** n) * 0
        
    # 3사분면
    elif r >= 2 ** n and c < 2 ** n:
        # 예시 기준 첫번쨰 32 (16 * 2)
        ans += (2 ** n) * (2 ** n) * 2
        # 압축되면 세로길이가 줄어듬
        r -= (2 ** n)
        
    # 4사분면
    else:
        # 예시 기준 첫번쨰 48 (16 * 3)
        ans += (2 ** n) * (2 ** n) * 3
        # 가로 세로 길이 동시에 줄어듬
        r -= (2 ** n)
        c -= (2 ** n)
        
print(ans)