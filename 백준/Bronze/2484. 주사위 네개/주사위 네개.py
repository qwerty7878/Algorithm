t = int(input())
ans = []

for _ in range(t):
    dice = list(map(int, input().split()))
    dice_set = set(dice)
    
    # 같은 눈이 4개가 나오면 50,000원+(같은 눈)×5,000원의 상금을 받게 된다.
    if len(dice_set) == 1:
        num = dice[0]
        res = 50000 + num * 5000
        ans.append(res)
    # 같은 눈이 3개만 나오면 10,000원+(3개가 나온 눈)×1,000원의 상금을 받게 된다.
    elif len(dice_set) == 2:
        for num in dice_set:
            if dice.count(num) == 3:
                res = 10000 + (num * 1000)
                ans.append(res)
                break
    # 같은 눈이 2개씩 두 쌍이 나오는 경우에는 2,000원+(2개가 나온 눈)×500원+(또 다른 2개가 나온 눈)×500원의 상금을 받게 된다.
        else:
            dice_set = sorted(list(dice_set))
            res = 2000 + (dice_set[0] * 500) + (dice_set[1] * 500)
            ans.append(res)
    # 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    elif len(dice_set) == 3:
        for num in dice_set:
            if dice.count(num) == 2:
                res = 1000 + (num * 100)
                ans.append(res)
                break
    # 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    else:
        res = max(dice) * 100
        ans.append(res)

print(max(ans))