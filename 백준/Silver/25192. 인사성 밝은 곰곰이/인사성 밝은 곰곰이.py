import sys

n = int(sys.stdin.readline())

chat = set()
cnt = 0
for i in range(n):
    name = sys.stdin.readline().strip()
    if name == 'ENTER':
        cnt += len(chat)
        chat.clear()
    else:
        chat.add(name)
print(cnt + len(chat))