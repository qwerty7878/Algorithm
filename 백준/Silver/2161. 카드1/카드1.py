import sys
from collections import deque

n = int(sys.stdin.readline())
cards = [card for card in range(1, n + 1)]
# print(cards)

cards = deque(cards)
while cards:
    try:
        print(cards.popleft(),end=' ')
        cards.append(cards.popleft())
    except:
        break