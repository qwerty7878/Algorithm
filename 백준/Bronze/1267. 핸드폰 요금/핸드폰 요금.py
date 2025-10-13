t = int(input())
call_time_list = list(map(int, input().split()))

younsik_Price = 0
minsik_Price = 0

def younsik_time_to_price(time):
    if (time % 60) < 30:
        return 10 + ((time // 30) * 10)
    else:
        return 20 + ((time // 60) * 20)

def minsik_time_to_price(time):
    if (time % 60) < 60:
        return 15 + ((time // 60) * 15)
    else:
        return 30 + ((time // 60) * 30)

for time in call_time_list:
    younsik_Price += younsik_time_to_price(time)
    minsik_Price += minsik_time_to_price(time)

if younsik_Price > minsik_Price:
    print("M", minsik_Price)
elif younsik_Price == minsik_Price:
    print("Y M", minsik_Price)
else:
    print("Y", younsik_Price)