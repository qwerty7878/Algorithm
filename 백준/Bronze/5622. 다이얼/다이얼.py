str = input().upper()
time = 0
for char in str:
    if char in 'ABC':
        time += 2
    if char in 'DEF':
        time += 3
    if char in 'GHI':
        time += 4
    if char in 'JKL':
        time += 5
    if char in 'MNO':
        time += 6
    if char in 'PQRS':
        time += 7
    if char in 'TUV':
        time += 8
    if char in 'WXYZ':
        time += 9
print(time + len(str))