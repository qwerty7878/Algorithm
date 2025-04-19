a,b = map(int,input().split())
c = int(input())

time = b + c

if time < 60:
    print(a, time)
if time >= 60 and (a + (time // 60)) < 24:
    print(a + (time // 60), time % 60)
if time >= 60 and (a + (time // 60)) >= 24:
    print((a + (time // 60)) % 24, time % 60)