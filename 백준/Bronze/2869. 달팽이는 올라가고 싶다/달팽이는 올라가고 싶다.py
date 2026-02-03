import math

a,b,v = map(int, input().split(' '))
day = 1
restDistance = v - a
movePerDay = a - b

day += math.ceil(restDistance / movePerDay)
print(day)