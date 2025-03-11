from collections import Counter

n = int(input())
card_arr1 = list(map(int, input().split()))

m = int(input())
card_arr2 = list(map(int, input().split()))

counter = Counter(card_arr1)

for i in card_arr2:
    if i in counter:
        print(counter[i],end=' ')
    else:
        print(0,end=' ')