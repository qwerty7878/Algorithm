m,n = map(int, input().split())
pocketmons = []
pocketmons_idx = dict()

for i in range(m):
    name = input()
    pocketmons.append(name)
    pocketmons_idx[name] = i + 1

for i in range(n):
    question = input()
    if question.isdigit():
        print(pocketmons[int(question) - 1])
    else:
        print(pocketmons_idx[question])