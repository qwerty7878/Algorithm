numberCard = [num for num in range(1, 21)]

for _ in range(10):
    a,b = map(int, input().split())
    numberCard[a - 1:b] = numberCard[a - 1:b][::-1]
print(' '.join(map(str, numberCard)))