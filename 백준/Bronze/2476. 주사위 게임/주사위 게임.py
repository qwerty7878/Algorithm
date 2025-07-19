t = int(input())
arr = []
for i in range(t):
    dice = list(map(int, input().split()))
    dice.sort()
    if dice[0] == dice[1] and dice[0] == dice[2] and dice[1] == dice[2]:
        arr.append(10000 + (dice[0] * 1000))
    elif dice[0] == dice[1] or dice[0] == dice[2] or dice[1] == dice[2]:
        arr.append(1000 + (dice[1] * 100))
    else:
        arr.append(100 * max(dice))
print(max(arr))