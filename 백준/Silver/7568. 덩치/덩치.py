import sys
input = sys.stdin.readline

n = int(input().strip())
people = []

for _ in range(n):
    w,h = map(int, input().split(' '))
    people.append([w, h])

for i in range(n):
    current_w = people[i][0]
    current_h = people[i][1]
    ranking = 1
    for j in range(len(people)):
        if current_w < people[j][0] and current_h < people[j][1]:
            ranking += 1
    print(ranking, end=' ')