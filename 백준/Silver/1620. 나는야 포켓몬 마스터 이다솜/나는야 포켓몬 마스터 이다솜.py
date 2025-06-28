import sys

n,m = map(int,sys.stdin.readline().split())
pocketmon = {}
pocketmonlist = []

for i in range(n):
    name = sys.stdin.readline().strip()
    pocketmonlist.append(name)
    pocketmon[name] = i + 1

for i in range(m):
    question = sys.stdin.readline().strip()
    if question.isdigit():
        print(pocketmonlist[int(question) - 1])
    else:
        print(pocketmon[question])