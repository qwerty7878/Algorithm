n,gameType = input().split()
n = int(n)

nickname = []
for _ in range(n):
    name = input()
    nickname.append(name)

nickname = set(nickname)
if gameType == 'Y':
    print(len(nickname))
elif gameType == 'F':
    print(len(nickname) // 2)
elif gameType == 'O':
    print(len(nickname) // 3)