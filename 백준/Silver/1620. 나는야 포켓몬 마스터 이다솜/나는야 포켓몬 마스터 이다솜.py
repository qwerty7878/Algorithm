import sys
input = sys.stdin.readline

n, m = map(int, input().split())
pocketmonNameToNumList = dict()
pocketmonNumToNameList = dict()

for i in range(n):
    name = input().strip()
    pocketmonNameToNumList[i + 1] = name
    pocketmonNumToNameList[name] = i + 1

for _ in range(m):
    question = input().strip()

    if question.isdigit():
        num = int(question)
        print(pocketmonNameToNumList[num])
    else:
        print(pocketmonNumToNameList[question])