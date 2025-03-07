n = int(input())
card_arr1 = set(map(int, input().split()))

m = int(input())
card_arr2 = list(map(int, input().split()))

for i in card_arr2:
    if i in card_arr1:
        print(1, end=' ')
    else:
        print(0, end=' ')