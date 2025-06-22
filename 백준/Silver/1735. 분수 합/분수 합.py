import math

sona,moma = map(int,input().split())
sonb,momb = map(int,input().split())

up = (sona * momb) + (sonb * moma)
down = moma * momb

divide = math.gcd(up,down)
if divide != 1 and (up % divide == 0 and down % divide == 0):
    print(up//divide, down//divide)
else:
    print(up,down)