l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())

a_time = 0
if a % c == 0:
    a_time = a // c
else:
    a_time = a // c + 1

b_time = 0
if b % d == 0:
    b_time = b // d
else:
    b_time = b // d + 1

print(l - max(a_time, b_time))