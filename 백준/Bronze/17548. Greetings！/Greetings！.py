s = input()
temp = ''
for char in s:
    if char == 'e':
        temp += 'e'
temp = temp * 2
# print(temp)
answer = 'h' + temp + 'y'
print(answer)