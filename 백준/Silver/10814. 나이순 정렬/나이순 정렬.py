import sys
input = sys.stdin.readline

n = int(input().strip())
user = []

for _ in range(n):
    age, name = input().strip().split(' ')
    user.append([int(age), name])

user.sort(key= lambda x: x[0])

for age, name in user:
    print(age, name)