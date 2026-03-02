x,y = map(int, input().split())

days = [31,28,31,30,31,30,31,31,30,31,30,31]
weeks = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

total = y
for i in range(x - 1):
    total += days[i]
print(weeks[total % 7])