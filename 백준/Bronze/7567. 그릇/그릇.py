str = input()

sum = 10
temp = str[0]
for i in range(1, len(str)):
    if  str[i] == temp:
        sum += 5
    elif str[i] != temp:
        sum += 10
    temp = str[i]
print(sum)