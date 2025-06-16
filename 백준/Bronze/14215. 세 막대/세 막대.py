staff = list(map(int,input().split()))
staff.sort()

if staff[-1] >= sum(staff) - staff[-1]:
    print(((staff[0] + staff[1]) * 2) - 1)
else:
    print(sum(staff))