n = int(input())
ox_list = list(map(int, input().split()))
res = 0
combo = 0

for num in ox_list:
    if num == 1:
        combo += 1
        res += combo
    else:
        combo = 0
print(res)