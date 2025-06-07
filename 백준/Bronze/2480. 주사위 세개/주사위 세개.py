dice = list(map(int, input().split()))
dice.sort()

if dice[0] == dice[1] and dice[0] == dice[2] and dice[1] == dice[2]:
    print(10000 + (dice[0] * 1000))
elif dice[0] != dice[1] and dice[0] != dice[2] and dice[1] != dice[2]:
    print(max(dice) * 100)
else:
    if dice[0] == dice[1]:
        print(1000 + (100 * dice[0]))
    elif dice[0] == dice[2]:
        print(1000 + (100 * dice[0]))
    else:
        print(1000 + (100 * dice[1]))