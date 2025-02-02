x = int(input())
line = 1

while (line * (line + 1) // 2) < x:
    line += 1

start = line * (line - 1) // 2 + 1
position = x - start + 1

if line % 2 == 0:
    up = position
    down = line - position + 1
elif line % 2 == 1:
    up = line - position + 1
    down = position

print(f'{up}/{down}')