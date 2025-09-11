import sys

t = int(sys.stdin.readline())
person = []

for i in range(t):
    person.append(list(map(int, sys.stdin.readline().split())))

ans = []
for i in range(t):
    rank = 1
    h = person[i][1]
    w = person[i][0]
    for j in range(len(person)):
        if h < person[j][1] and w < person[j][0]:
            rank += 1
    print(rank, end=' ')