n = int(input())

count = 0
num = 1
while True:
    if count == n:
        print(num)
        break
        
    num += 1
    temp = str(num)
    if '666' in temp:
        count += 1