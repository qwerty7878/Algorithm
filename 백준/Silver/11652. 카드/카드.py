import sys

n = int(sys.stdin.readline())
cards = {}

for _ in range(n):
    card = int(sys.stdin.readline())
    if card not in cards:
        cards[card] = 1
    else:
        cards[card] += 1

answer = sorted(cards.items(), key=lambda x: (-x[1], x[0]))
print(answer[0][0])