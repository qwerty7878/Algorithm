v = int(input())
str = input()

if str.count('A') > str.count('B'):
    print('A')
elif str.count('B') > str.count('A'):
    print('B')
else:
    print('Tie')