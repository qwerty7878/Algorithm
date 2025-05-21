a,b,v = map(int,input().split())

day = 1
v = v - a # 이미 하루 올라간 상태

day += v / (a - b) # 이후 갭 만큼 증가

if day == int(day):
    print(int(day))
else:
    print(int(day) + 1)