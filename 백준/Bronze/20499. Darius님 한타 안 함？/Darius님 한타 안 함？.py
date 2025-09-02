import sys

str = sys.stdin.readline().strip().split('/')

if int(str[0]) + int(str[2]) < int(str[1]) or int(str[1]) == 0:
    print('hasu')
else:
    print('gosu')